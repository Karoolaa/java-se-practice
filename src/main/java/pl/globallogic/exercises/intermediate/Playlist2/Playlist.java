package pl.globallogic.exercises.intermediate.Playlist2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albums;

    public Playlist() {
        this.albums = new ArrayList<>();
    }

    public boolean addAlbum(String title, String artist) {
        Album album = new Album(title, artist);
        return albums.add(album);
    }

    public boolean addToPlaylist(String albumTitle, String songTitle, LinkedList<Song> playlist) {
        Album album = findAlbum(albumTitle);
        if (album != null) {
            return album.addToPlayList(songTitle, playlist);
        }
        System.out.println("The album " + albumTitle + " is not in the playlist");
        return false;
    }

    public boolean addToPlaylist(String albumTitle, int trackNumber, LinkedList<Song> playlist) {
        Album album = findAlbum(albumTitle);
        if (album != null) {
            return album.addToPlayList(trackNumber, playlist);
        }
        System.out.println("The album " + albumTitle + " is not in the playlist");
        return false;
    }

    private Album findAlbum(String title) {
        for (Album album : albums) {
            if (album.getTitle().equals(title)) {
                return album;
            }
        }
        return null;
    }
}