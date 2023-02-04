package com.promineo.playlist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.playlist.entity.Song;
import com.promineo.playlist.service.SongService;

@RestController
public class DefaultSongController implements SongController {
  @Autowired
  private SongService songService;
  
  
  @Override
  public List<Song> fetchSongsFromAlbum(Long albumFk) {
    return songService.fetchSongsFromAlbum(albumFk);
  }

}
