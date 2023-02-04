package com.promineo.playlist.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Represents the songs on an album.
 * @author racso
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Song {
  private Long songPk;
  private Long albumFk;
  private String songName;
  
  @JsonIgnore
  public Long getAlbumFk() {
    return albumFk;
  }
  @JsonIgnore
  public Long getSongPk() {
    return songPk;
  }
}
