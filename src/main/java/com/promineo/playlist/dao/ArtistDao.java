package com.promineo.playlist.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInputEntity;

public interface ArtistDao {

  Optional<Artist> fetchArtist(String artistName);

  Stream<Artist> fetchAllArtists();

  Optional<Artist> createArtist(ArtistInputEntity input);

  
}
