package pl.globallogic.exercises.intermediate.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber >= 1 && trackNumber <= songs.size()) {
            Song song = songs.get(trackNumber - 1);
            return addToPlayList(song, playlist);
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            return addToPlayList(song, playlist);
        }
        return false;
    }

    private boolean addToPlayList(Song song, LinkedList<Song> playlist) {
        if (playlist.add(song)) {
            return true;
        }
        return false;
    }
}
