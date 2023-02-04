package com.promineo.playlist.dao;

import java.util.List;
import com.promineo.playlist.entity.Album;
import com.promineo.playlist.entity.ArtistAlbum;

public interface AlbumDao {

  List<ArtistAlbum> fetchAlbum(Long albumPk);

}
