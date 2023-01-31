package com.promineo.playlist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.promineo.playlist.entity.Artist;
import com.promineo.playlist.entity.ArtistInput;
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
  @Operation(summary = "Gets an artist by its specific name.")
  @GetMapping(value = "/artists/{artistName}")
  public Artist fetchArtist(@PathVariable("artistName") String artistName) {
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
  @Operation(summary = "Creates an artist.")
  @PostMapping(value = "/artists")
  public Artist createArtist(@RequestBody ArtistInput artistInput) {
    if((artistInput != null) && (artistInput.isValid())) {
      Artist artist = artistService.createArtist(artistInput);
      if(artist != null) {
        return artist;
      }
      throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
          "An unhandled exception triggered. Artist was not created.");
    }
    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid artist, fields missing,");
  }
}
