package lab2.task4;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "The book " + this.title + " was written by " + this.author + " and was published in the year "
                           + this.year + "!";
    }
}
