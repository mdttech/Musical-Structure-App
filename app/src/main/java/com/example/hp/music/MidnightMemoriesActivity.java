package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MidnightMemoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Alive", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Best Song Ever", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Better Than Words", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Diana", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Don't Forget Where You Belong", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Happily", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Little Black Dress", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Midnight Memories", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Right Now", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Story Of My Life", "One Direction", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
