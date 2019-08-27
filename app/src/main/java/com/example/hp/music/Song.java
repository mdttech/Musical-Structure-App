package com.example.hp.music;

/**
 * {@link Song} represents a single song name .
 * Each object has 3 properties: name of song, name of artist, and image resource ID.
 */

public class Song {

    // Name of the SongsActivity (e.g. More Than This, Story of my life)
    private String mSongName;

    // Artist Name (e.g. One direction,Enrique iglesias)
    private String mArtistName;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new Song object.
     *
     * @param vName is the name of the song (e.g. More than this)
     * @param vArtist is the corresponding songs artist name (e.g. one direction)
     * @param image is drawable reference ID that corresponds to the song
     * */
    public Song(String vName, String vArtist, int imageResourceId) {
        mSongName = vName;
        mArtistName = vArtist;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
