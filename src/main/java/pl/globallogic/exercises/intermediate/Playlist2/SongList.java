package pl.globallogic.exercises.intermediate.Playlist2;

public static class SongList {
    private ArrayList<Song> songs;

    private SongList() {
        this.songs = new ArrayList<>();
    }

    private boolean add(Song song) {
        if (!songs.contains(song)) {
            songs.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    private Song findSong(int trackNumber) {
        if (trackNumber >= 1 && trackNumber <= songs.size()) {
            return songs.get(trackNumber - 1);
        }
        return null;
    }
}
    }