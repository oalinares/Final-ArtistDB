package com.promineo.playlist.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import com.promineo.playlist.entity.Artist;

public interface ArtistDao {

  List<Artist> fetchArtist(String artistName);

  Optional<Artist> createArtist(String artistName, int initialFormation, BigDecimal artistRating,
      String notes);

  Optional<Artist> updateArtist(String artistName, BigDecimal artistRating, String notes);

  Optional<Artist> deleteArtist(String artistName);

 

 
}
