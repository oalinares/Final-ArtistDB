package com.promineo.playlist.service;

import java.util.List;
import com.promineo.playlist.entity.ArtistAlbum;

public interface AlbumService {

  List<ArtistAlbum> fetchAlbum(Long albumFk);

}
