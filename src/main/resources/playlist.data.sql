INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('David Bowie', 1962, 4.8, 'David Bowie from the sets of Twin Peaks: Fire Walk With Me to the red plains of Mars, they are excellent all around');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('David Byrne', 1971, 4.9, 'Psycho killer, qu\'est-ce que c\'est? Nope, just David byrneing down the house');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('Modest Mouse', 1992, 4.5, 'Isaac Brock of Modest Mouse brings so much passion to his songs that sometimes you have hit repeat to the point of being on a path shaped like a figure eight');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('Brian Eno', 1970, 4.2, 'Eno, meeny, miny, moe, code with Brian playing, fo\' sho\'.');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('Spinal Tap', 1964, 11, 'What can I say, everyone can crank it up a notch, but these guys...they go to eleven');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('Black Sabbath', 1968, 4.8, 'Music greatness can only be becoming from a name like Black Sabbath, but who knows due to being previously known as The Polka Tulk Blues Band');
INSERT INTO artist (artist_name, initial_formation, artist_rating, notes) VALUES ('Karl Hyde', 1980, 3.9, 'You can run, but you can\'t Hyde from Karl when it comes to new wave.');


INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('David Bowie(Self-titled)', '1967', 3.5, 'The beginnings of amazing music, and the ending of terrible hair cuts, just like his hair, this album could use some work');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('My Life In the Bush of Ghosts', '1981', 4.5, 'I would rather spend my life in a bush of ghosts than an ocean of Phish.');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('The Rise and Fall of Ziggy Stardust and the Spiders from Mars', '1972', 5.0, 'Who exactly is Ziggy Stardust? This album  will show you exactly who they are from birth to death, and we give our hands to his wonder');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('Good News For People Who Love Bad News', '2004', 3.9,'Good News: this album is a triumph of joy, and heartfelt moments. Bad News: there is none, read the album name');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('This Is Spinal Tap', '1984', 3.0, 'The track list goes to eleven.');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('Paranoid', '1970', 5, 'Truly a masterpiece of Heavy Metal');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('Rei Momo', '1989', 4.7, 'Hand in hand, the latin music style with Byrne\'s lyricism brings a sound I would have never thought would work.');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('Apollo', '1983', 4.0, 'This album won\'t make you feel like Rocky versus Apollo, but provides some great music to code to.');
INSERT INTO album (album_name, release_date, album_rating, album_notes) VALUES ('Someday World', '2014', 3.5, 'Eno and Hyde together remind me of Daft Punk if they got into new wave.');

INSERT INTO artist_album (artist_fk, album_fk) VALUES (1, 1);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (1, 3);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (2, 2);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (2, 7);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (3, 4);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (4, 2);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (4, 8);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (4, 9);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (5, 5);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (6, 6);
INSERT INTO artist_album (artist_fk, album_fk) VALUES (7, 9);


INSERT INTO song (album_fk, song_name) VALUES (1, 'Uncle Arthur');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Sell Me A Coat');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Rubber Band');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Love You Till Tuesday');
INSERT INTO song (album_fk, song_name) VALUES (1, 'There Is A Happy Land');
INSERT INTO song (album_fk, song_name) VALUES (1, 'We Are Hungry Men');
INSERT INTO song (album_fk, song_name) VALUES (1, 'When I Live My Dream');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Little Bombardier');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Silly Boy Blue');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Come And Buy My Toys');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Join The Gang');
INSERT INTO song (album_fk, song_name) VALUES (1, 'She\'s Got Medals');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Maid Of Bond Street');
INSERT INTO song (album_fk, song_name) VALUES (1, 'Please Mr. Gravedigger');


INSERT INTO song (album_fk, song_name) VALUES (2, 'America Is Waiting');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Mea Culpa');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Regiment');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Help Me Somebody');
INSERT INTO song (album_fk, song_name) VALUES (2, 'The Jezebel Spirit');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Qu\'ran');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Moonlight In Glory');
INSERT INTO song (album_fk, song_name) VALUES (2, 'The Carrier');
INSERT INTO song (album_fk, song_name) VALUES (2, 'A Secret Life');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Come WIth Us');
INSERT INTO song (album_fk, song_name) VALUES (2, 'Mountain Of Needles');



INSERT INTO song (album_fk, song_name) VALUES (3, 'Five Years');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Soul Love');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Moonage Daydream');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Starman');
INSERT INTO song (album_fk, song_name) VALUES (3, 'It Ain\'t Easy');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Lady Stardust');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Star');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Hang On To Yourself');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Ziggy Stardust');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Suffragette City');
INSERT INTO song (album_fk, song_name) VALUES (3, 'Rock \'n\' Roll Suicide');

INSERT INTO song (album_fk, song_name) VALUES (4, 'Horn Intro');
INSERT INTO song (album_fk, song_name) VALUES (4, 'The World At Large');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Float On');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Ocean Breathes Salty');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Dig Your Grave');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Bury Me With It');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Dance Hall');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Bukowski');
INSERT INTO song (album_fk, song_name) VALUES (4, 'This Devil\'s Workday');
INSERT INTO song (album_fk, song_name) VALUES (4, 'The View');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Satin In A Coffin');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Interlude Milo');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Blame It On The Tetons');
INSERT INTO song (album_fk, song_name) VALUES (4, 'Black Cadillacs');
INSERT INTO song (album_fk, song_name) VALUES (4, 'One Chance');
INSERT INTO song (album_fk, song_name) VALUES (4, 'The Good Times Are Killing Me');

INSERT INTO song (album_fk, song_name) VALUES (5, 'Hell Hole');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Tonight I\'m Gonna Rock You Tonight');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Heavy Duty');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Rock and Roll Creation');
INSERT INTO song (album_fk, song_name) VALUES (5, 'America');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Cup And Cakes');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Big Bottom');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Sex Farm');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Stonehenge');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Gimme Some Money');
INSERT INTO song (album_fk, song_name) VALUES (5, 'Listen To The Flower People');

INSERT INTO song (album_fk, song_name) VALUES (6, 'War Pigs');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Paranoid');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Planet Caravan');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Iron Man');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Electric Funeral');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Hand Of Doom');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Rat Salad');
INSERT INTO song (album_fk, song_name) VALUES (6, 'Fairies Wear Boots');

INSERT INTO song (album_fk, song_name) VALUES (7, 'Independence Day');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Make Believe Mambo');
INSERT INTO song (album_fk, song_name) VALUES (7, 'The Call Of The Wild');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Dirty Old Town');
INSERT INTO song (album_fk, song_name) VALUES (7, 'The Rose Tattoo');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Loco De Amor');
INSERT INTO song (album_fk, song_name) VALUES (7, 'The Dream Police');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Don\'t Want To Be Part Of Your World');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Marching Through The Wilderness');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Good And Evil');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Lie To Me');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Office Cowboy');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Women vs Men');
INSERT INTO song (album_fk, song_name) VALUES (7, 'Carnival Eyes');
INSERT INTO song (album_fk, song_name) VALUES (7, 'I Know Sometimes A Man Is Wrong');

INSERT INTO song (album_fk, song_name) VALUES (8, 'Under Stars');
INSERT INTO song (album_fk, song_name) VALUES (8, 'The Secret Place');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Matta');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Signals');
INSERT INTO song (album_fk, song_name) VALUES (8, 'An Ending');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Under Stars II');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Drift');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Silver Morning');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Deep Blue Day');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Weightless');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Always Returning');
INSERT INTO song (album_fk, song_name) VALUES (8, 'Stars');

INSERT INTO song (album_fk, song_name) VALUES (9, 'The Satellites');
INSERT INTO song (album_fk, song_name) VALUES (9, 'Daddy\'s Car');
INSERT INTO song (album_fk, song_name) VALUES (9, 'A Man Wakes Up');
INSERT INTO song (album_fk, song_name) VALUES (9, 'Witness');
INSERT INTO song (album_fk, song_name) VALUES (9, 'Strip It Down');
INSERT INTO song (album_fk, song_name) VALUES (9, 'Mother Of A Dog');
INSERT INTO song (album_fk, song_name) VALUES (9, 'Who Rings The Bell');
INSERT INTO song (album_fk, song_name) VALUES (9, 'When I Build This World');
INSERT INTO song (album_fk, song_name) VALUES (9, 'To Us All');