package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TakeMeHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Rock Me", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Live While Were Yooung", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Cmon,Cmon", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Heart Attack", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Kiss You", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("More Than This", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Little Things", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Last First Kiss", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Change My Mind", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Taken", "One Direction", R.mipmap.ic_launcher_foreground));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }


}
