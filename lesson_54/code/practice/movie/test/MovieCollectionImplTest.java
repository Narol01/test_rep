package practice.movie.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.movie.dao.MoviesCollection;
import practice.movie.dao.MovieCollectionImpl;
import practice.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {

    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MovieCollectionImpl(List.of(
                new Movie(101, "T1", "G1", "D1", now.minusYears(10)),
                new Movie(102, "T2", "G1", "D2", now.minusYears(12)),
                new Movie(103, "T3", "G3", "D1", now.minusYears(2)),
                new Movie(104, "T4", "G4", "D3", now.minusYears(5))
        ));
    }

    @Test
    void addMovie() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(102, "T2", "G2", "D2", now.minusYears(12))));
        assertEquals(4, moviesCollection.totalQuantity());
        assertTrue(moviesCollection.addMovie(new Movie(105, "T4", "G4", "D3", now.minusYears(5))));
        assertEquals(5, moviesCollection.totalQuantity());
    }

    @Test
    void removeMovie() {
        assertNull(moviesCollection.removeMovie(100));
        assertEquals(4,moviesCollection.totalQuantity());
        assertEquals( new Movie(101, "T1", "G1", "D1", now.minusYears(10)),moviesCollection.removeMovie(101));
    }

    @Test
    void findById() {
        Movie person = moviesCollection.findByImdb(102);
        assertEquals(102, person.getImdb());
        assertEquals("D2", person.getDirector());
        assertEquals("G1", person.getGenre());
        assertEquals("T2", person.getTitle());
        assertEquals( now.minusYears(12) , person.getDate());
        assertNull(moviesCollection.findByImdb(100)); // не будет найден отсутствующий, а метод вернет null
    }

    @Test
    void findByGenre() {
        Iterable<Movie> person=moviesCollection.findByGenre("G1");
        Collection<Movie> actual=new ArrayList<>();
        for(Movie p:person){
            actual.add(p);
        }
        List<Movie> expected=List.of(
                new Movie(101, "T1", "G1", "D1", now.minusYears(10)),
                new Movie(102, "T2", "G1", "D2", now.minusYears(12)));
        assertEquals(expected,actual);
    }

    @Test
    void findByDirector() {
        Iterable<Movie> person=moviesCollection.findByDirector("D1");
        List<Movie> actual = new ArrayList<>();
        for(Movie p:person){
            actual.add(p);
        }
        List<Movie> expected=List.of(
                new Movie(101, "T1", "G1", "D1", now.minusYears(10)),
                new Movie(103, "T3", "G3", "D1", now.minusYears(2)));
        assertEquals(expected,actual);
    }

    @Test
    void findMoviesCreatedBetweenDates() {
        Iterable<Movie> persons = moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(12), now.minusYears(10));
        // перенесем полученных в рез-те поиска в ArrayList
        List<Movie> actual = new ArrayList<>();
        for (Movie person : persons) {
            actual.add(person);
        }
        Collections.sort(actual);
        List<Movie> expected = List.of (
                new Movie(101, "T1", "G1", "D1", now.minusYears(10)),
                new Movie(102, "T2", "G1", "D2", now.minusYears(12))
        );
        assertEquals(expected, actual);
    }

    @Test
    void totalQuantity() {
        assertEquals(4,moviesCollection.totalQuantity());
    }
}
