package com.promineo.playlist.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineo.playlist.entity.ArtistAlbum;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/artist_album")
@OpenAPIDefinition(info = @Info(title = "Album Service"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server")})

public interface AlbumController {
  //@formatter:off
  
  @Operation(
      summary = "Returns an album and the artist(s)",
      description = "Returns an album and the artist(s) on the album.",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "An album and the artist(s) is returned", 
              content = @Content(mediaType = "application/json", 
              schema = @Schema(implementation = ArtistAlbum.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No album was found with the input criteria.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json"))
          
      },
      parameters = {
          @Parameter(
          name = "albumFk",
          allowEmptyValue = false,
          required = false,
          description = "The album's id (i.e '(1:David Bowie(Self-Titled)),"
              + " (2:My Life In The Bush of Ghosts), (3:The Rise and Fall of Ziggy Startdust,"
              + "(4:Good News For People Who Love Bad News), (5:This Is Spinal Tap), (6:Paranoid),"
              + "(7:Rei Momo), (8:Apollo), (9:Someday World)"),
  
      }
)
@GetMapping
@ResponseStatus(code = HttpStatus.OK)
 List<ArtistAlbum> fetchAlbum( 
     @RequestParam(required = false)
     Long albumFk);
  //@formatter:on
}
