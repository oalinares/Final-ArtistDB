package com.promineo.playlist.entity;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Comparator;
import java.util.Date;
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
public class Album implements Comparable<Album> {
  private Long albumPk;
  private String albumName;
  private Date releaseDate;
  private BigDecimal albumRating;
  private String albumNotes;
  
  
  
  @Override
  public int compareTo(Album that) {
    return Comparator
        .comparing(Album::getAlbumName)
        .compare(this, that);
  }
}
