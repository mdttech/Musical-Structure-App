package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EscapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Escape", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Don't Turn Off the Lights", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Love to See You Cry", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Hero", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Will Suervive", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Love 4 Fun", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Maybe", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("One Night Stand", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("She Be the One", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("If the World Crashes Down", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
