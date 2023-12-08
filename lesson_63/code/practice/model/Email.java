package practice.model;

import java.util.Objects;

public class Email {

    String email;

    String subjects;
    String text;

    public Email(String email) {
        this.email = email;
    }

    public Email(String email, String subjects, String text) {
        this.email = email;
        this.subjects = subjects;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email) && Objects.equals(subjects, email1.subjects) && Objects.equals(text, email1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, subjects, text);
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", subjects='" + subjects + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
