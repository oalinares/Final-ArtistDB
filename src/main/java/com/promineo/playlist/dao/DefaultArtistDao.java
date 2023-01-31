package com.promineo.playlist.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
import com.promineo.playlist.entity.ArtistInput;
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
                  rs.getInt("artist_pk"),
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
      if(artist.size() ==1) {
        return Optional.of(artist.get(0));
      }
      return Optional.empty();
      
 
  
}
//BAD REQUEST ON THIS METHOD, MUST TEST
  @Override
  public Optional<Artist> createArtist(ArtistInput artistInput) {
    if((artistInput != null) && (artistInput.isValid())) {
      String sql = ""
          + "INSERT INTO artist (artist_pk, artist_name, initial_formation, artist_rating, notes) "
          + "VALUES (:artist_name, :initial_formation, :artist_rating, :notes);";
      Map<String, Object> params = new HashMap<>();
      params.put("artist_name", artistInput.getArtistName());
      params.put("initial_formation", artistInput.getInitialFormation());
      params.put("artist_rating", artistInput.getArtistRating());
      params.put("notes", artistInput.getNotes());
      
      int rows = jdbcTemplate.update(sql, params);
      if (rows == 1) {
        return fetchArtist(artistInput.toString());
      }
      
    }
    return Optional.empty();
  }
}