package homework.book1.model;

import java.util.Objects;

public abstract class Book {

    protected String title;
    protected String author;
    protected int year;
    protected String ISBN;

    public Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
