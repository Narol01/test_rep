package homework.book.tests;

import homework.book1.dao.BookImpl;
import homework.book1.dao.Library;
import homework.book1.model.Book;
import homework.book1.model.Dictionary;
import homework.book1.model.Roman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookImplTest {
    Library library;

    Book[] books;

    @BeforeEach
    void setUp() {
        library=new BookImpl(5);
        Book[] book=new Book[6];
        book[0]=new Dictionary("New Oxford Spelling Dictionary","by Oxford Languages",2014,
                "124","Spelling",596);
        book[1]=new Dictionary("A grammatical dictionary of the English language","by Karl",2008,
                "345","Grammatical",148);
        book[2]=new Roman("Белые ночи","Достоевский",1848,"101");
    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(library.addBook(books[1]));
        Book books1 = new Roman("В поисках утраченого времени","Марсель Пруст",1913,"154");
        assertTrue(library.addBook(books1));
        assertEquals(5, library.quantity());
        Book books2 = new Roman("Золотой жук","Эдгар Алан По",1843,"543");
        assertFalse(library.addBook(books2));
    }

    @Test
    void removeEmployee() {
        // удаляем книги
        assertEquals(books[1] ,library.removeBook("543"));
        assertEquals(3, library.quantity()); // книги стало на 1 меньше (4 - 1)
        assertNull(library.removeBook("543")); // дважды не можем удалить
        assertNull(library.findBook("543")); // не можем найти после удаления
    }

    @Test
    void findEmployee() {
        // ищем книгу по
        assertEquals( books[1], library.findBook("101"));
        // ищем несуществующюю книгу
        assertNull(library.findBook("101"));
    }

    @Test
    void quantity() {
    }

    @Test
    void printBook() {
    }
}