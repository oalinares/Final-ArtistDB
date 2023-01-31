package com.promineo.playlist.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInputEntity;
import com.promineo.playlist.service.ArtistService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Artists")
@OpenAPIDefinition(info = @Info(title = "Artists: What I listen to..."))
@RestController
public class ArtistController {

  
  private ArtistService artistService;
  
  public ArtistController(ArtistService artistService) {
    this.artistService = artistService;
  }
  @Operation(summary = "Gets an artist by their specific name.")
  @GetMapping(value = "/artists/{artistName}")
  public Artist fetchArtist(@PathVariable String artistName) {
    if((artistName != null) && (! artistName.isEmpty())) {
      Artist artist = artistService.fetchArtist(artistName);
      if(artist != null) {
        return artist;
      }
      throw new ResponseStatusException(HttpStatus.NOT_FOUND,
          String.format("Artist (%s) not found.", artistName));
    }
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Artist not provided.");
  }
  
  @Operation(summary = "Gets all available artists")
  @GetMapping(value = "/artists")
  public List<Artist> fetchAllArtists() {
    List<Artist> artists = artistService.fetchAllArtists();
    return artists;
    
  }
  
  @Operation(summary = "Creates a new artist that I have listened to recently")
  @PostMapping(value = "/artists")
  public Artist createArtist(@RequestBody ArtistInputEntity input) {
    if(input != null && input.isValid()) {
      Artist artist = artistService.createArtist(input);
      if(artist != null) {
        return artist;
      }
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unhandled exception triggerd, Artist was not add");
    }
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Inavlid input or fields missing", input));
  }
  
}
