package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // find button that shows artist details
        Button artistDetails = (Button) findViewById(R.id.artist_details);

        // set an OnClickListener on that button
        artistDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentArtistDetails = new Intent(NowPlayingActivity.this, ArtistDetailsActivity.class);

                // start the new activity
                startActivity(intentArtistDetails);
            }
        });

        // find button that shows album details
        Button albumDetails = (Button) findViewById(R.id.album_details);

        // set an OnClickListener on that button
        albumDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent
                Intent intentAlbumDetails = new Intent(NowPlayingActivity.this, AlbumDetailsActivity.class);

                // start the new activity
                startActivity(intentAlbumDetails);
            }
        });
    }
}
