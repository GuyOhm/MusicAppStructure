package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the button that shows the Now Playing screen
        Button nowPlaying = (Button) findViewById(R.id.now_playing);

        // set an onClickListener on that button
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open now playing activity
                Intent intentNowPlaying = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start now playing activity
                startActivity(intentNowPlaying);
            }
        });

        // find the button that shows the Search screen
        Button search = (Button) findViewById(R.id.search);

        // set an onClickListener on that button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open search activity
                Intent intentSearch = new Intent(MainActivity.this, SearchActivity.class);

                // Start search activity
                startActivity(intentSearch);
            }
        });

        // find the button that shows the Library activity
        Button library = (Button) findViewById(R.id.library);

        // set an onClickListener on that button
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open library activity
                Intent intentLibrary = new Intent(MainActivity.this, LibraryActivity.class);

                // start library activity
                startActivity(intentLibrary);
            }
        });
    }
}
