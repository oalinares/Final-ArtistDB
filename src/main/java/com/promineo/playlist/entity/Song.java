package com.promineo.playlist.entity;

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
  private Integer songPk;
  private Album album;
  private String songName;
  private Integer songOrder;
}
