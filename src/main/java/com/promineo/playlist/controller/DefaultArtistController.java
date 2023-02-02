package com.promineo.playlist.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.service.ArtistService;

@RestController
public class DefaultArtistController implements ArtistController {
  @Autowired
  private ArtistService artistService;
  
  @Override
  public List<Artist> fetchArtist(String artistName) {
    return artistService.fetchArtist(artistName);
  }

  @Override
  public Optional<Artist> createArtist(String artistName, int initialFormation,
      BigDecimal artistRating, String notes) {
    
    return artistService.createArtist(artistName, initialFormation, artistRating, notes);
  }

  @Override
  public Optional<Artist> updateArtist(String artistName, BigDecimal artistRating, String notes) {
    return artistService.updateArtist(artistName, artistRating, notes);
  }

  @Override
  public Optional<Artist> deleteArtist(String artistName) {
    return artistService.deleteArtist(artistName);
  }

  
}
