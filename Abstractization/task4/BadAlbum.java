package Abstractization.task4;

public class BadAlbum extends Album {

    private boolean is_palindrome(Song song) {
        int copy = song.id;
        int output = 0;
        while(copy != 0) {
            output = output * 10 + copy % 10;
            copy /= 10;
        }
        return song.id == output;

    }
    public void addSong(Song new_song) {
        if(is_palindrome(new_song) && new_song.nume.length() == 3)
            playlist.add(new_song);
    }

    @Override
    public String toString() {
        String ans = "";
        for(var el : playlist) {
            ans = ans.concat(el.toString() + "\n");
        }
        return ans;
    }
}
