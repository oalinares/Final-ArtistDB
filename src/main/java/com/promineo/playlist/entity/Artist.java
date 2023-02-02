package com.promineo.playlist.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.Year;
import java.util.Comparator;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an artist or band.
 * @author racso
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
  
  
  private String artistName;
  private Integer initialFormation;
  private BigDecimal artistRating;
  private String notes;

}
  