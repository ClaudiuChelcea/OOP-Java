package LAB5.task4;

public class Song {
    String nume;
    int id;
    String composer;

    public Song() {
    }

    public Song(String nume, int id, String composer) {
        this.nume = nume;
        this.id = id;
        this.composer = composer;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public String toString() {
        return "Song with id " + id + " named " + nume + " was written by " + composer + "!";
    }
}
