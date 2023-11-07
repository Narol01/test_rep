package homework.book1.dao;

import homework.book1.model.Book;
import homework.book1.model.Dictionary;
import homework.book1.model.Roman;
import practice.pets.modul.Pets;

public class BookImpl implements Library {
    private  Book[] books;
    private int size;

    public BookImpl(int capacity) {
        books=new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if(book == null || size == books.length || findBook(book.getISBN()) != null){
            return false;
        }
        books[size]=book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(String isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getISBN()==isbn){
                Book victim=books[i];
                books[i]=books[size-1];// на место найденного поставили последнего кто естi in
                books[size-1]=null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(String isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getISBN()==isbn){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findBooks(String author) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                c++;
            }
        }
        Book[] doc = new Book[c];
        for (int i = 0, j = 0; j <c; i++) {
            if (books[i].getAuthor().equals(author)) {
                doc[j++]=books[i];
            }
        }
        return doc;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}
