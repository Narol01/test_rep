package practice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    String author;
    String name;
    Integer issueYear;
    List<Reviews> reviews;

    public Book(String author, String name, Integer issueYear) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.reviews= new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=' " + author + '\'' +
                ", name=' " + name + '\'' +
                ", issueYear= " + issueYear +
                ", reviews "+ reviews+
                '}';
    }
}
