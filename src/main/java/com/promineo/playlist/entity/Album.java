package com.promineo.playlist.entity;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Comparator;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Represents an album of an artist or band.
 * @author racso
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Album  {
  private Long albumPk;
  private String albumName;
  private Integer releaseDate;
  private BigDecimal albumRating;
  private String albumNotes;
  
  @JsonIgnore
  public Long getAlbumPk() {
  return albumPk;
  }
  
  
  
}
