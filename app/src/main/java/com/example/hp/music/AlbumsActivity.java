package com.example.hp.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the songs category
        Button songs = (Button) findViewById(R.id.songs_activity);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the playing category
        TextView playing = (TextView) findViewById(R.id.playing_activity);

// Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumsActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        // Find the View that shows the four album category
        TextView fourAlbum = (TextView) findViewById(R.id.four_album);

// Set a click listener on that View
        fourAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the four album view is clicked on.
            @Override
            public void onClick(View view) {
                Intent fourAlbumIntent = new Intent(AlbumsActivity.this, FourActivity.class);
                startActivity(fourAlbumIntent);
            }
        });

        // Find the View that shows the midnight Memories album category
        TextView midnightMemoriesAlbum = (TextView) findViewById(R.id.midnight_memories_album);

// Set a click listener on that View
        midnightMemoriesAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the midnight Memoriesview is clicked on.
            @Override
            public void onClick(View view) {
                Intent midnightMemoriesAlbumIntent = new Intent(AlbumsActivity.this, MidnightMemoriesActivity.class);
                startActivity(midnightMemoriesAlbumIntent);
            }
        });

        // Find the View that shows the Up All Night album category
        final TextView upAllNightAlbum = (TextView) findViewById(R.id.up_all_night_album);

// Set a click listener on that View
        upAllNightAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Up All Night is clicked on.
            @Override
            public void onClick(View view) {
                Intent upAllNightAlbumIntent = new Intent(AlbumsActivity.this, UpAllNightActivity.class);
                startActivity(upAllNightAlbumIntent);
            }
        });

        // Find the View that shows the take me home  album category
        TextView takeMeHomeAlbum = (TextView) findViewById(R.id.take_me_home_album);

// Set a click listener on that View
        takeMeHomeAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Take Me Home is clicked on.
            @Override
            public void onClick(View view) {
                Intent takeMeHomeAlbumIntent = new Intent(AlbumsActivity.this, TakeMeHomeActivity.class);
                startActivity(takeMeHomeAlbumIntent);
            }
        });


        // Find the View that shows the sex and love album category
        TextView sexAndLoveAlbum = (TextView) findViewById(R.id.sex_and_love_album);

// Set a click listener on that View
        sexAndLoveAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sex and love is clicked on.
            @Override
            public void onClick(View view) {
                Intent sexAndLoveAlbumIntent = new Intent(AlbumsActivity.this, SexAndLoveActivity.class);
                startActivity(sexAndLoveAlbumIntent);
            }
        });


        // Find the View that shows the escape album category
        TextView escapeAlbum = (TextView) findViewById(R.id.escape_album);

// Set a click listener on that View
        escapeAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when escape view is clicked on.
            @Override
            public void onClick(View view) {
                Intent escapeAlbumIntent = new Intent(AlbumsActivity.this, EscapeActivity.class);
                startActivity(escapeAlbumIntent);
            }
        });


        // Find the View that shows the Euphoria album category
        TextView euphoriaAlbum = (TextView) findViewById(R.id.euphoria_album);

// Set a click listener on that View
        euphoriaAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Euphoria view is clicked on.
            @Override
            public void onClick(View view) {
                Intent euphoriaAlbumIntent = new Intent(AlbumsActivity.this, EuphoriaActivity.class);
                startActivity(euphoriaAlbumIntent);
            }
        });


        // Find the View that shows the Insomniac album category
        TextView insomniacAlbum = (TextView) findViewById(R.id.insomniac_album);

// Set a click listener on that View
        insomniacAlbum.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Insomniac view is clicked on.
            @Override
            public void onClick(View view) {
                Intent insomniacAlbumIntent = new Intent(AlbumsActivity.this, InsomniacActivity.class);
                startActivity(insomniacAlbumIntent);
            }
        });
    }
}
