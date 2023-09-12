package pl.globallogic.exercises.intermediate.Playlist2;

public static class Album {
    private String title;
    private String artist;
    private SongList songs;

    private Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = songs.findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = songs.findSong(trackNumber);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
}