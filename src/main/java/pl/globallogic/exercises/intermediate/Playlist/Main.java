package pl.globallogic.exercises.intermediate.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Nie istnieje
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // Nie istnieje

        playPlaylist(playList);
    }

    private static void playPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> iterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Now playing: " + iterator.next());

        boolean forward = true;
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter action: (1 - next, 2 - previous, 3 - replay, 4 - quit)");
            int choice =
                    switch (choice) {
                        case 1:
                            if (!forward) {
                                if (iterator.hasNext()) {
                                    iterator.next();
                                }
                                forward = true;
                            }

                            if (iterator.hasNext()) {
                                System.out.println("Now playing: " + iterator.next());
                            } else {
                                System.out.println("End of playlist.");
                                forward = false;
                            }
                            break;
                            }
                    }

        }
    }
}