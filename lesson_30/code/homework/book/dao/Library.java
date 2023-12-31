package homework.book.dao;


import homework.book1.model.Book;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(String isbn);
    Book findBook(String isbn);
    int quantity();
    void printBook();
}
