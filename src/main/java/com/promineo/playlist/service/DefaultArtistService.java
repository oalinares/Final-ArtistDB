package com.promineo.playlist.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineo.playlist.dao.ArtistDao;
import com.promineo.playlist.entity.Artist;

@Service
public class DefaultArtistService implements ArtistService {

  @Autowired
  private ArtistDao artistDao;
  
  @Transactional
  @Override
  public List<Artist> fetchArtist(String artistName) {
    return artistDao.fetchArtist(artistName);
  }

  @Override
  public Optional<Artist> createArtist(String artistName, int initialFormation,
      BigDecimal artistRating, String notes) {
    return artistDao.createArtist(artistName, initialFormation, artistRating, notes);
  }

  @Override
  public Optional<Artist> updateArtist(String artistName, BigDecimal artistRating, String notes) {
    return artistDao.updateArtist(artistName,artistRating, notes);
  }

  @Override
  public Optional<Artist> deleteArtist(String artistName) {
    return artistDao.deleteArtist(artistName);
  }
 
 
}
