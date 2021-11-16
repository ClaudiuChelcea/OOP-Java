package Abstractization.task4;

import java.util.ArrayList;

public abstract class Album {
    public ArrayList<Song> playlist;

    public Album() {
        playlist = new ArrayList<>();
    }

    public Album(ArrayList<Song> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Song> playlist) {
        this.playlist = playlist;
    }

    abstract void addSong(Song new_song);

    void removeSong(Song song_to_remove) {
        playlist.remove(song_to_remove);
    }

    @Override
    public String toString() {
        return "Album: ";
    }
}
