package com.promineo.playlist.entity;

import java.math.BigDecimal;
import java.time.Year;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArtistAlbum {

  private Long artistFk;
  private Long albumFk;
  private String artistName;
  private String albumName;
  private Integer releaseDate;
  private BigDecimal albumRating;
  private String albumNotes;
  
  @JsonIgnore
  public Long getArtistFk() {
    return artistFk;
  }
  
  @JsonIgnore
  public Long getAlbumFk() {
    return albumFk;
  }
}
 