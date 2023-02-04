package com.promineo.playlist.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineo.playlist.entity.Album;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistAlbum;
import com.promineo.playlist.entity.ArtistAlbum.ArtistAlbumBuilder;

@Component
public class DefaultAlbumDao implements AlbumDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<ArtistAlbum> fetchAlbum(Long albumFk) {
    //@formatter:off
    String sql = ""
        + "SELECT album_pk, album_name, release_date, album_rating, album_notes, artist_pk, artist_name "
        + "FROM album "
        + "JOIN artist_album ON artist_album.album_fk = album.album_pk "
        + "JOIN artist ON artist_album.artist_fk = artist.artist_pk "
        + "WHERE album_fk = :album_fk";
    //@formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("album_fk", albumFk);
    
    return jdbcTemplate.query(sql, params, new RowMapper<>() {

      @Override
      public ArtistAlbum mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
        return ArtistAlbum.builder()
            .artistName(rs.getString("artist_name"))
            .albumName(rs.getString("album_name"))
            .releaseDate(rs.getInt("release_date"))
            .albumRating(rs.getBigDecimal("album_rating"))
            .albumNotes(rs.getString("album_notes"))
            .build();
        
        //@formatter:on
      }
      
    });
  }

}
