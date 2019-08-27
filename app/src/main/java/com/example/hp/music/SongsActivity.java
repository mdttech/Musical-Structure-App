package com.example.hp.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the playing category
        TextView playing = (TextView) findViewById(R.id.playing_activity);

// Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(SongsActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums_activity);

// Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("More Than This", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Story Of My Life", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Wish", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Long Way Down", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Rock Me", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("MOVE TO MIAMI", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Heart Attack", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Like It", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Finally Found You", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Like How It Feels ", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }


}
