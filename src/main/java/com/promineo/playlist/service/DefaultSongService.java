package com.promineo.playlist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineo.playlist.dao.SongDao;
import com.promineo.playlist.entity.Song;

@Service
public class DefaultSongService implements SongService {
  @Autowired
  private SongDao songDao;
  
  @Override
  public List<Song> fetchSongsFromAlbum(Long albumFk) {
    return songDao.fetchSongsByAlbum(albumFk);
  }

}
