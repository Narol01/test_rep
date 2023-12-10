package practice.model;

import practice.model.Reviews;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Reviews implements Comparable<Reviews> {

    String books;
    int grade;
    String comment;

    Set<String> likes;

    public Reviews(String books, int grade, String comment) {
        this.books = books;
        this.grade = grade;
        this.comment = comment;
        this.likes=new HashSet<>();
    }

    public Set<String> getLikes() {
        return likes;
    }
    public void addLikes(String nameOfReader){
        if(nameOfReader!=null) {
            likes.add(nameOfReader);
        }
    }
    public int numberOffLikes(){
        return likes.size();
    }

    public String getBooks() {
        return books;
    }

    public int getGrade() {
        return grade;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return Objects.equals(books, reviews.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "books=" + books +
                ", grade=" + grade +
                ", comment='" + comment + '\'' +
                " likes - " + likes.size() +
                '}';
    }

    @Override
    public int compareTo(Reviews o) {
        return Integer.compare(this.grade,o.grade);
    }

}
