package com.promineo.playlist.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInputEntity;
import lombok.extern.slf4j.Slf4j;

@Repository
public class DefaultArtistDao implements ArtistDao {

  private NamedParameterJdbcTemplate jdbcTemplate;
  
  public DefaultArtistDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
  
  
  
  @Override
  public Optional<Artist> fetchArtist(String artistName) {
      String sql = "SELECT * "
                 + "FROM artist "
                 + "WHERE artist_name = :artist_name;";
      Map<String, Object> params = new HashMap<>();
      params.put("artist_name", artistName);
      
      List<Artist> artist = jdbcTemplate.query(sql, params, new RowMapper<>() {
        public Artist mapRow(ResultSet rs, int rowNum) {
            try {
              Artist artist = new Artist(
                  rs.getString("artist_name"),
                  rs.getInt("initial_formation"),
                  rs.getBigDecimal("artist_rating"),
                  rs.getString("notes"));
                  return artist;
            } catch (SQLException e) {
              return null;
            }       
        }
      });
      if(artist.size() >= 1) {
        return Optional.of(artist.get(0));
      }
      return Optional.empty();
      
 
  
}

  @Override
  public Stream<Artist> fetchAllArtists() {
    String sql = "SELECT artist_pk, artist_name, initial_formation, artist_rating, notes "
               + "FROM artist;";
    
    List<Artist> artists = jdbcTemplate.query(sql, new RowMapper<>() {
      public Artist mapRow(ResultSet rs, int rowNum) {
          try {
            Artist artist = new Artist(
                rs.getString("artist_name"),
                rs.getInt("initial_formation"),
                rs.getBigDecimal("artist_rating"),
                rs.getString("notes"));
                return artist;
          } catch (SQLException e) {
            return null;
          }       
      }
    });
    return artists.stream();
  }



  @Override
  public Optional<Artist> createArtist(ArtistInputEntity input) {
    if((input != null) && (input.isValid())) {
      String sql = ""
          + "INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) "
          + "VALUES (:artist_name, :initial_formation, :artist_rating, :notes);";
      
      Map<String, Object> params = new HashMap<>();
      params.put("artist_name", input.getArtistName());
      params.put("initial_formation", input.getInitialFormation());
      params.put("artist_rating", input.getArtistRating());
      params.put("notes", input.getNotes());
      
      int rows = jdbcTemplate.update(sql, params);
      
      if(rows == 1) {
        return fetchArtist(input.getArtistName());
      }
    }
    return Optional.empty();
  }
}
