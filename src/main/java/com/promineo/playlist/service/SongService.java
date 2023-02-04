package com.promineo.playlist.service;

import java.util.List;
import com.promineo.playlist.entity.Song;

public interface SongService {

  List<Song> fetchSongsFromAlbum(Long albumFk);

}
