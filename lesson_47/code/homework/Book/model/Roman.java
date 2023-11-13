package homework.Book.model;

public class Roman extends Book {
    public Roman(String title, String author, int year, String ISBN) {
        super(title, author, year, ISBN);
    }
    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }
}
