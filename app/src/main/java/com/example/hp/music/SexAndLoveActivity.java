package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SexAndLoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("I am  Freak", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("There goes my Baby", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Bialando", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("El Perdedor", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Loco", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Let Me Be Your Lover", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("You and I", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Heart Attack", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Me Cuesta Tanto Olvidarte", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Noche y De Día", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
