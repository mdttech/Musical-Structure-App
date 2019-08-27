package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Change Your Ticket", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Clouds", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Fireproof", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Fools Gold", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Girl Almighty", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Illusion", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Night Changes", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("No Control", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Once In A Life Time", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Ready To Run", "One Direction", R.mipmap.ic_launcher_foreground));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
