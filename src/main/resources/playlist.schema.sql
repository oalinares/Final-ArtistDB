DROP TABLE IF EXISTS song;
DROP TABLE IF EXISTS artist_album;
DROP TABLE IF EXISTS album;
DROP TABLE IF EXISTS artist;

CREATE TABLE artist (
  artist_pk BIGINT UNSIGNED AUTO_INCREMENT NOT NULL,
  artist_name VARCHAR(128) NOT NULL,
  initial_formation YEAR,
  artist_rating DECIMAL (7,2),
  notes TEXT,
  PRIMARY KEY (artist_pk)
);

CREATE TABLE album (
  album_pk BIGINT UNSIGNED AUTO_INCREMENT NOT NULL,
  album_name VARCHAR(128) NOT NULL,
  release_date YEAR NOT NULL,
  album_rating DECIMAL (7,2),
  album_notes TEXT,
  PRIMARY KEY (album_pk)
);

CREATE TABLE artist_album (
  artist_fk BIGINT UNSIGNED NOT NULL,
  album_fk BIGINT UNSIGNED NOT NULL,
  FOREIGN KEY (artist_fk) REFERENCES artist (artist_pk) ON DELETE CASCADE,
  FOREIGN KEY (album_fk) REFERENCES album (album_pk) ON DELETE CASCADE,
  UNIQUE KEY (artist_fk, album_fk)
 );

CREATE TABLE song (
  song_pk BIGINT UNSIGNED AUTO_INCREMENT NOT NULL,
  album_fk BIGINT UNSIGNED NOT NULL,
  song_name VARCHAR(64) NOT NULL,
  PRIMARY KEY (song_pk),
  FOREIGN KEY (album_fk) REFERENCES album (album_pk) ON DELETE CASCADE
);