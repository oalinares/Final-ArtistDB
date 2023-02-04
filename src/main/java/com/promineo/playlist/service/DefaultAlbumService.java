package com.promineo.playlist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineo.playlist.dao.AlbumDao;
import com.promineo.playlist.entity.ArtistAlbum;

@Service
public class DefaultAlbumService implements AlbumService {

  @Autowired
  private AlbumDao albumDao;
  
  @Override
  public List<ArtistAlbum> fetchAlbum(Long albumFk) {
    return albumDao.fetchAlbum(albumFk);
  }

}
