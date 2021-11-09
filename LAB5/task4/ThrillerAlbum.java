package LAB5.task4;

public class ThrillerAlbum extends Album {

    public void addSong(Song new_song) {
        if(new_song.composer == "Michael Jackson")
            playlist.add(new_song);
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("");

        for(var el : playlist)
            ans = ans.append(el + "\n");

        return ans.toString();
    }
}
