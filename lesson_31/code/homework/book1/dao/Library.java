package homework.book1.dao;


import homework.book1.model.Book;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(String isbn);
    Book findBook(String isbn);
    Book[] findBooks(String author);
    int quantity();
    void printBook();
}
