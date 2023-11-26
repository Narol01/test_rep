package practice.movie.dao;

import practice.movie.model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MoviesCollection extends Iterable<Movie>{
    boolean addMovie(Movie movie);
    Movie removeMovie(long imdb);
    Movie findByImdb(long imdb);
    Iterable<Movie> findByGenre(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to);
    int totalQuantity();

}