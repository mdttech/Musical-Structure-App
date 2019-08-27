package com.example.hp.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class InsomniacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Ring My Bells", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Push", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Do You Know? (The Ping Pong Song)", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Somebody's Me", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("On Top of You", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Tired Of Being Sorry", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Miss You", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Wish I Was Your Lover", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Litte Girl", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));
        songs.add(new Song("Stay Here Tonight", "Enrique Iglesias", R.mipmap.ic_launcher_foreground));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
