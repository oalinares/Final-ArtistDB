package com.promineo.playlist.dao;

import java.util.List;
import java.util.Optional;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInput;

public interface ArtistDao {

  Optional<Artist> fetchArtist(String artistName);

  Optional<Artist> createArtist(ArtistInput artistInput);
}
