package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EuphoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("I Like It", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("One Day at a Time", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Heartbeat", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Dirty Dancer", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Why Not Me?", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("No Me Digas Que No", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Ayer", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Heartbreake", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Coming Home", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("No Me Digas Que No", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
