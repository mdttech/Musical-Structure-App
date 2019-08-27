package com.example.hp.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        // Find the View that shows the songs category
        Button songs = (Button) findViewById(R.id.songs_activity);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlayingActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });


        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums_activity);

// Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlayingActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the skip back icon category
        ImageButton back = (ImageButton) findViewById(R.id.skip_back_icon);

// Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the skip back icon View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Switched to previous song", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows the skip forward icon category
        ImageButton forward = (ImageButton) findViewById(R.id.skip_forward_icon);

// Set a click listener on that View
        forward.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the skip forward icon View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Switched to next song", Toast.LENGTH_SHORT).show();
            }
        });


        // Find the View that shows the skip back icon category
        ImageButton play = (ImageButton) findViewById(R.id.play_icon);

// Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play icon View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song is playing", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
