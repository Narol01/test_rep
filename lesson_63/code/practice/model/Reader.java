package practice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    String fio;

    String Email;

    boolean subscriber;

    List<Book> books;

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        Email = email;
        this.subscriber = subscriber;
        this.books=new ArrayList<>();
    }

    public Reader(String fio, String email) {
        this.fio = fio;
        Email = email;
    }

    public boolean isSubscriber(){
        return subscriber;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }

    public String getFio() {
        return fio;
    }

    public String getEmail() {
        return Email;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(Email, reader.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Email);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", Email='" + Email + '\'' +
                ", subscriber=" + subscriber +
                ", books=" + books +
                '}';
    }
}
