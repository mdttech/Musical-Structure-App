package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UpAllNightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Another World", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Gotta Be You", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Want", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("I Wish", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Same Mistake", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Circles", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Stole My Heart", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Up All Night", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Whats Make You Beautiful", "One Direction", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Tell Me A Lie", "One Direction", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
