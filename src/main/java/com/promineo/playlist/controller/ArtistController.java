package com.promineo.playlist.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineo.playlist.entity.Artist;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/artists")
@OpenAPIDefinition(info = @Info(title = "Artist Service"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server")})

public interface ArtistController {
  //@formatter:off
  @Operation( 
      summary = "Returns an artist",
      description = "Returns an artist and certain details about the artist",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "An artist is returned", 
              content = @Content(mediaType = "application/json", 
              schema = @Schema(implementation = Artist.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No artist was found with the input criteria.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json"))
          
      },
      parameters = {
          @Parameter(
              name = "artistName", 
              allowEmptyValue = false, 
              required = false, 
              description = "The artist's name (i.e, 'David Bowie, Dolly Parton')"),
      }
 )
  
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  List<Artist> fetchArtist(
      @RequestParam(required = false) 
      String artistName);
  //@formatter:on
  
  
  //@formatter:off
  
  @Operation(
      summary = "Creates a new artist",
      description = "Creates a new artist, and returns the data input",
      responses = {
          @ApiResponse(
              responseCode = "201", 
              description = "The created artist is returned", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Artist.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "An artist detail was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred",
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "artistName",
              required = true,
              description = "Artist's name"),
          @Parameter(
              name = "initialFormation",
              required = true,
              description = "The year the artist/band formed"),
          @Parameter(
              name = "artistRating",
              required = true,
              description = "Personal rating of artist from 0.0 to 5.0"),
          @Parameter(
              name = "notes",
              required = true,
              description = "Give a brief summary of the artist or band")
      
    }
)
@PostMapping
@ResponseStatus(code = HttpStatus.CREATED)
  Optional<Artist> createArtist( 
      @RequestParam(required = true)
      String artistName,
      @RequestParam(required = true)
      int initialFormation,
      @RequestParam(required = true)
      BigDecimal artistRating,
      @RequestParam(required = true)
      String notes);
  
  //@formatter:on
  
  //@formatter:off
  @Operation(
      summary = "Updates an existing artist",
      description = "Updates an existing artist in your playlist",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "Artist was updated successfully", 
              content = @Content(
                  mediaType = "application/json", 
                  schema = @Schema(implementation = Artist.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "An artist detail was not found with the input criteria", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred",
              content = @Content(mediaType = "application/json"))
      },
      
      parameters = {
          @Parameter(
              name = "artistName",
              required = true,
              description = "Artist's name"),
          @Parameter(
              name = "artistRating",
              required = true,
              description = "Personal rating of artist from 0.0 to 5.0"),
          @Parameter(
              name = "notes",
              required = true,
              description = "Give a brief summary of the artist or band")    }
)
@PutMapping
@ResponseStatus(code = HttpStatus.OK)
 Optional<Artist> updateArtist(
     @RequestParam(required = true)
     String artistName,
     @RequestParam(required = true)
     BigDecimal artistRating,
     @RequestParam(required = true)
     String notes);
  //@formatter:on
  
//@formatter:off
  @Operation( 
      summary = "Deletes an artist",
      description = "Deletes an artist from the playlist database",
      responses = {
          @ApiResponse(
              responseCode = "200", 
              description = "An artist is deleted succesfully", 
              content = @Content(mediaType = "application/json", 
              schema = @Schema(implementation = Artist.class))),
          @ApiResponse(
              responseCode = "400", 
              description = "The request parameters are invalid.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404", 
              description = "No artist was found with the input criteria.", 
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500", 
              description = "An unplanned error occurred.", 
              content = @Content(mediaType = "application/json"))
          
      },
      parameters = {
          @Parameter(
              name = "artistName", 
              allowEmptyValue = false, 
              required = false, 
              description = "The artist's name (i.e, 'David Bowie, Dolly Parton')"),
      }
 )
  
  @DeleteMapping
  @ResponseStatus(code = HttpStatus.OK)
  Optional<Artist> deleteArtist(
      @RequestParam(required = false) 
      String artistName);
}
