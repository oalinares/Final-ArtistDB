package com.promineo.playlist.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineo.playlist.entity.Artist;

@Component
public class DefaultArtistDao implements ArtistDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Artist> fetchArtist(String artistName) {
    //@formatter:off
    String sql = "SELECT artist_name, initial_formation, artist_rating, notes "
        + "FROM artist "
        + "WHERE artist_name = :artist_name";
  //@formatter:on
    Map<String, Object> params = new HashMap<>();
    params.put("artist_name", artistName);
    
    return jdbcTemplate.query(sql, params,
        new RowMapper<>() {
      @Override
      public Artist mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
        return Artist.builder()
            .artistName(rs.getString("artist_name"))
            .initialFormation(rs.getInt("initial_formation"))
            .artistRating(rs.getBigDecimal("artist_rating"))
            .notes(rs.getString("notes"))
            .build();
        
        //@formatter:on
      }});
  }

  @Override
  public Optional<Artist> createArtist(String artistName, int initialFormation,
      BigDecimal artistRating, String notes) {
    //@formatter:off
    String sql = ""
        + "INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) "
        + "VALUES (:artist_name, :initial_formation, :artist_rating, :notes)";
    //@formatter:on
    Map<String, Object> params = new HashMap<>();
    params.put("artist_name", artistName);
    params.put("initial_formation", initialFormation);
    params.put("artist_rating", artistRating);
    params.put("notes", notes);
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(Artist.builder()
        .artistName(artistName)
        .initialFormation(initialFormation)
        .artistRating(artistRating)
        .notes(notes)
        .build());
        
  }

  @Override
  public Optional<Artist> updateArtist(String artistName, BigDecimal artistRating, String notes) {
    //@formatter:off
    String sql = ""
        + "UPDATE artist "
        + "SET artist_name = :artist_name, artist_rating = :artist_rating, notes = :notes "
        + "WHERE (artist_name = :artist_name)";
    //@formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("artist_name", artistName);
    params.put("artist_rating", artistRating);
    params.put("notes", notes);

    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(Artist.builder()
        .artistName(artistName)
        .artistRating(artistRating)
        .notes(notes)
        .build());
    
  }

  @Override
  public Optional<Artist> deleteArtist(String artistName) {
    //@formatter:off
    String sql = ""
        + "DELETE FROM artist "
        + "WHERE artist_name = :artist_name";    
    //@formatter:on
    Map<String, Object> params = new HashMap<>();
    params.put("artist_name", artistName);
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(Artist.builder()
        .artistName(artistName)
        .build());
  }

  }


