package com.promineo.playlist.entity;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ArtistInputEntity {

  
  
  private String artistName;
  
  private Integer initialFormation;
  
  private BigDecimal artistRating;
  
  private String notes;
  

  @JsonIgnore
  public boolean isValid() {
    return getArtistName() != null && (! getArtistName().isEmpty());
  }
}
