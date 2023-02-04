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
import com.promineo.playlist.entity.Song;

@Component
public class DefaultSongDao implements SongDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Song> fetchSongsByAlbum(Long albumFk) {
    //@formatter:off
    String sql = ""
        + "SELECT song_pk, album_fk, song_name "
        + "FROM song "
        + "WHERE album_fk = :album_fk";
    //@formatter:on
    
    Map<String, Object> params = new HashMap<>();
    params.put("album_fk", albumFk);
    
    return jdbcTemplate.query(sql, params, new RowMapper<>() {

      @Override
      public Song mapRow(ResultSet rs, int rowNum) throws SQLException {
        //@formatter:off
        return Song.builder()
            .songName(rs.getString("song_name"))
            .build();
        //@formatter:on
      }
      
    });
  }

}
