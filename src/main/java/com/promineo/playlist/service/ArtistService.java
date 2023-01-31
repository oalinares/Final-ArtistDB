package com.promineo.playlist.service;

import java.util.List;
import java.util.Optional;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInputEntity;

public interface ArtistService {
  /**
   * Gets an artist by the artist's name.
   * @param artistName
   * @return The artist that was searched, or else null
   */
  Artist fetchArtist(String artistName);

  List<Artist> fetchAllArtists();

  Artist createArtist(ArtistInputEntity input);

  

  
}
