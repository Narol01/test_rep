package practice.movie.dao;

import practice.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;


public class MovieCollectionImpl implements MoviesCollection {
    // поле для хранения объекта типа List
    List<Movie> moviesList; // список фильмов

    // заполняем ArrayList объектами из списка фильмов List<Movie> movies, который подаем на вход
    public MovieCollectionImpl(List<Movie> movies) {
        this.moviesList = new ArrayList<>(movies);
        for (Movie m : movies) {
            //movies.add(m);
            addMovie(m);
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        // null не добавляем
        if(movie == null){
            return false;
        }
        // нельзя добавить фильм с таким же imdb
        if (findByImdb(movie.getImdb()) != null){
            return false;
        }
        // или еще можно так
        if(moviesList.contains(movie)) {
            return false;
        }
        // добавляем фильм
        moviesList.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findByImdb(imdb);
        if (victim != null) {
            moviesList.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Movie findByImdb(long imdb) {
        // в moviesList надо найти элемент, у которого совпадает imdb с искомым
        for (Movie m : moviesList) {
            if(m.getImdb() == imdb) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : moviesList) {
            if(m.getGenre().equals(genre)) {
                foundByGenre.add(m);
            }
        }
        return foundByGenre;

//        Movie pattern = new Movie(Integer.MIN_VALUE, null, genre, null, null);
//        int from = Collections.binarySearch(moviesList, pattern, genreComparator);
//        pattern = new Movie(Integer.MAX_VALUE, null, genre, null, null);
//        int to = Collections.binarySearch(moviesList, pattern, genreComparator);
//        return moviesList.subList(from, to >= 0 ? to + 1 : -to - 1);
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        List<Movie> foundByDirector = new ArrayList<>();
        for (Movie m : moviesList) {
            if(m.getDirector().equals(director)) {
                foundByDirector.add(m);
            }
        }
        return foundByDirector;
    }


    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
//        List<Movie> foundByDate = new ArrayList<>();
//        for (Movie m : moviesList) {
//            if (m.getDate().isAfter(from) | m.getDate().equals(from) && m.getDate().isBefore(to) | m.getDate().equals(to)) {
//                foundByDate.add(m);
//            }
//        }
//        return foundByDate;

        return moviesList.stream()
                .filter(m -> m.getDate().isAfter(from) |  m.getDate().equals(from) && m.getDate().isBefore(to) | m.getDate().equals(to))
                .collect(Collectors.toList());

    }

    @Override
    public int totalQuantity() {
        return moviesList.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return moviesList.iterator();
    }
}