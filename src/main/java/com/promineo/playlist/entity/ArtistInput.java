package com.promineo.playlist.entity;

import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
/**
 * Represents the input of the user to create an artist or band entity.
 * @author racso
 *
 */
@Data
public class ArtistInput {

  @NotNull
  @Length(max = 250)
  private String artistName;
  
  @NotNull
  @Positive
  private Integer initialFormation;
  
  @Positive
  @Min(0)
  @Max(11)
  private BigDecimal artistRating;
  
  @NotNull
  @Length(max = 250)
  private String notes;
  
  public boolean isValid() {
    return getArtistName() != null && (! getArtistName().isEmpty()) &&
        getInitialFormation() != null && (getInitialFormation().equals(initialFormation)) &&
        getArtistRating() != null && (getArtistRating().equals(artistRating)) &&
        getNotes() != null && (! getNotes().isEmpty());
  }
}
