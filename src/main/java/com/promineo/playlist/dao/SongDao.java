package com.promineo.playlist.dao;

import java.util.List;
import com.promineo.playlist.entity.Song;

public interface SongDao {

  List<Song> fetchSongsByAlbum(Long albumFk);

}
