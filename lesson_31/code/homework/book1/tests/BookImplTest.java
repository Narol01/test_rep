package homework.book1.tests;

import homework.book1.dao.BookImpl;
import homework.book1.dao.Library;
import homework.book1.model.Book;
import homework.book1.model.Dictionary;
import homework.book1.model.Roman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.pets.modul.Pets;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookImplTest {
    Library library;

    Book[] book;

    @BeforeEach
    void setUp() {
        library=new BookImpl(6);
        book=new Book[5];
        book[0]=new Dictionary("New Oxford Spelling Dictionary","by Oxford Languages",2014,
                "124","Spelling",596);
        book[1]=new Dictionary("A grammatical dictionary of the English language","by Karl",2008,
                "345","Grammatical",148);
        book[2]=new Roman("Белые ночи","Достоевский",1848,"101");
        book[3]=new Roman("Записки мёртвого дома","Достоевский",1848,"102");

        for (int i = 0; i < book.length; i++) {
            library.addBook(book[i]);
        }
    }

    @Test
    void addBooks() {
        assertFalse(library.addBook(null));
        assertFalse(library.addBook(book[2]));
        Book books1 = new Roman("В поисках утраченого времени","Марсель Пруст",1913,"154");
        assertTrue(library.addBook(books1));
        assertEquals(4, library.quantity());
        Book books2 = new Roman("Золотой жук","Эдгар Алан По",1843,"543");
        assertFalse(library.addBook(books2));
    }

    @Test
    void removeBooks() {
        assertEquals(book[0] ,library.removeBook("124"));
        assertEquals(2, library.quantity());
        assertNull(library.removeBook("124"));
        assertNull(library.findBook("124"));
    }

    @Test
    void findBooks(){
        Book[] expected={book[2],book[3]};
        assertArrayEquals(expected,library.findBooks("Достоевский"));
        System.out.println(Arrays.toString(library.findBooks("Достоевский")));
        assertNull(library.findBook("2355"));
    }

    @Test
    void findBook() {
        assertEquals( book[1], library.findBook("345"));
        assertNull(library.findBook("1101"));
    }

    @Test
    void quantity() {
        assertEquals(3,library.quantity());
    }

    @Test
    void printBook() {
        library.printBook();
    }
}