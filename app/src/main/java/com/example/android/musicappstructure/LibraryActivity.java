package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // find button that shows songs list
        Button mySongs = (Button) findViewById(R.id.library_songs);

        // set an OnClickListener on that button
        mySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentMySongs = new Intent(LibraryActivity.this, MySongsActivity.class);

                // start a new activity
                startActivity(intentMySongs);
            }
        });

        // find button that shows albums list
        Button myAlbums = (Button) findViewById(R.id.library_albums);

        // set an OnClickListener on that button
        myAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentMyAlbums = new Intent(LibraryActivity.this, MyAlbumsActivity.class);

                // start a new activity
                startActivity(intentMyAlbums);
            }
        });

        // find button that shows artists list
        Button myArtists = (Button) findViewById(R.id.library_artists);

        // set an OnClickListener on that button
        myArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentMyArtists = new Intent(LibraryActivity.this, MyArtistsActivity.class);

                // start a new activity
                startActivity(intentMyArtists);
            }
        });

        // find button that shows playlists
        Button myPlaylists = (Button) findViewById(R.id.library_playlists);

        // set an OnClickListener on that button
        myPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentMyPlaylists = new Intent(LibraryActivity.this, MyPlaylistsActivity.class);

                // start a new activity
                startActivity(intentMyPlaylists);
            }
        });
    }
}
