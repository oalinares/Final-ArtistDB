package com.promineo.playlist.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineo.playlist.entity.ArtistAlbum;
import com.promineo.playlist.service.AlbumService;

@RestController
public class DefaultAlbumController implements AlbumController {
  @Autowired
  private AlbumService albumService;

  @Override
  public List<ArtistAlbum> fetchAlbum(Long albumFk) {
    return albumService.fetchAlbum(albumFk);
  }

}
