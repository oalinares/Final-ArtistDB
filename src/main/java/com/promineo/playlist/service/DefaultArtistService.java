package com.promineo.playlist.service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineo.playlist.dao.ArtistDao;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInput;
import lombok.extern.slf4j.Slf4j;

@Service
public class DefaultArtistService implements ArtistService {

  private ArtistDao artistDao;
  
  public DefaultArtistService(ArtistDao artistDao) {
    this.artistDao = artistDao;
  }
  
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

  @Override
  public Artist createArtist(ArtistInput artistInput) {
    if((artistInput != null) && (artistInput.isValid())) {
      Optional<Artist> artist = artistDao.createArtist(artistInput);
      if(artist.isPresent()) {
        return artist.get();
      }
    }
    return null;
  }

  
}
