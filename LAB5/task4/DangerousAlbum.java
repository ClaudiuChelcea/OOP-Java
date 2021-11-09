package LAB5.task4;

public class DangerousAlbum extends Album {
    private boolean is_prime(Song song) {
        for(int i = 2; i * i < song.id; ++i) {
            if(song.id % i == 0)
                return false;
        }
        return true;
    }

    public void addSong(Song new_song) {
        if(is_prime(new_song))
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
