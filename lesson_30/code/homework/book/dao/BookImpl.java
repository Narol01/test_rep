package homework.book.dao;

import homework.book1.dao.Library;
import homework.book1.model.Book;

public class BookImpl implements Library {
    private  Book[] books;

    public BookImpl(int capacity) {
        books=new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public Book removeBook(String isbn) {
        return null;
    }

    @Override
    public Book findBook(String isbn) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printBook() {

    }
}
