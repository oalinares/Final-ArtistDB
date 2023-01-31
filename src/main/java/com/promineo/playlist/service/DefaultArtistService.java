package com.promineo.playlist.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineo.playlist.dao.ArtistDao;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInputEntity;

@Service
public class DefaultArtistService implements ArtistService {

  private ArtistDao artistDao;
  
  public DefaultArtistService(ArtistDao artistDao) {
    this.artistDao = artistDao;
  }
  
  @Transactional
  @Override
  public Artist fetchArtist(String artistName) {
    if((artistName != null) && (! artistName.isEmpty())) {
      Optional<Artist> artist = artistDao.fetchArtist(artistName);
      if(artist.isPresent()) {
        return artist.get();
      }
    }
    return null;
  }
  
  @Transactional
  @Override
  public List<Artist> fetchAllArtists() {
    Stream <Artist> artists = artistDao.fetchAllArtists();
    return artists.collect(Collectors.toList());
  }

  @Transactional
  @Override
  public Artist createArtist(ArtistInputEntity input) {
    if(input != null && input.isValid()) {
      Optional<Artist> artist = artistDao.createArtist(input);
      if(artist.isPresent()) {
        return artist.get();
      }
    }
    return null;
  }

  

  
}
