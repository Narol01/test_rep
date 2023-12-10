package practice.model;

import java.util.*;


public class Library {
    List<Book> books;
    List<Reader> readers;

    List<Reviews> reviews;

    public Library(){
        init();
    }
    private void init(){
        books=new ArrayList<>();
        // добавляем книги
        books.add(new Book("George Orwell", "1984", 1949)); // 0
        books.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 1997)); // 1
        books.add(new Book("J.R.R. Tolkien", "The Lord of the Rings", 1954)); // 2
        books.add(new Book("Harper Lee", "To Kill a Mockingbird", 1960)); // 3
        books.add(new Book("F. Scott Fitzgerald", "The Great Gatsby", 1925)); // 4
        books.add(new Book("Leo Tolstoy", "War and Peace", 1869)); //5

// добавляем читателей
        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true)); // 0
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true)); // 1
        readers.add(new Reader("Сидоров Сергей Сергеевич", "sidiriv.email@test.ru", true)); // 2

// Добавляем отзывы от читателей о книге
        reviews=new ArrayList<>();
        reviews.add(new Reviews("1984",4,"Very interesting,but long"));//0
        reviews.add(new Reviews("1984",5,"Very interesting"));//1
        reviews.add(new Reviews("Harry Potter and the Sorcerer's Stone",2,"Interesting"));//2
        reviews.add(new Reviews("Harry Potter and the Sorcerer's Stone",5,"Very cool"));//3
        reviews.add(new Reviews("Harry Potter and the Sorcerer's Stone",4,"Wonderfully"));//4
        reviews.add(new Reviews("The Lord of the Rings",4,"OK."));//5
        reviews.add(new Reviews("To Kill a Mockingbird",2,"OK."));//6
        reviews.add(new Reviews("War and Peace",3,"so so"));//7
        reviews.add(new Reviews("War and Peace",2,"Not my"));//8
        reviews.add(new Reviews("The Great Gatsby",5,"Fantastic"));//9
        Random random=new Random();

//Лайки к комментариям
reviews.get(0).addLikes(readers.get(1).getFio());
reviews.get(1).addLikes(readers.get(2).getFio());
reviews.get(2).addLikes(readers.get(0).getFio());
reviews.get(3).addLikes(readers.get(1).getFio());
reviews.get(4).addLikes(readers.get(2).getFio());
reviews.get(5).addLikes(readers.get(0).getFio());
reviews.get(6).addLikes(readers.get(1).getFio());
reviews.get(7).addLikes(readers.get(1).getFio());
reviews.get(8).addLikes(readers.get(2).getFio());
reviews.get(3).addLikes(readers.get(2).getFio());
reviews.get(3).addLikes(readers.get(0).getFio());
reviews.get(6).addLikes(readers.get(2).getFio());
reviews.get(4).addLikes(readers.get(1).getFio());
reviews.get(5).addLikes(readers.get(1).getFio());
reviews.get(8).addLikes(readers.get(0).getFio());


//журнал отзывов к книге
        books.get(0).getReviews().add(reviews.get(0));
        books.get(0).getReviews().add(reviews.get(1));
        books.get(1).getReviews().add(reviews.get(2));
        books.get(1).getReviews().add(reviews.get(3));
        books.get(1).getReviews().add(reviews.get(4));
        books.get(2).getReviews().add(reviews.get(5));
        books.get(3).getReviews().add(reviews.get(6));
        books.get(5).getReviews().add(reviews.get(7));
        books.get(5).getReviews().add(reviews.get(8));


// журнал выдачи книг
        readers.get(0).getBooks().add(books.get(0)); // Иванов взял книгу Джордж Оруэлл
        readers.get(1).getBooks().add(books.get(0)); // Петров взял книгу Оруэлла
        readers.get(1).getBooks().add(books.get(1)); // Петров взял книгу с индексом 1
        readers.get(1).getBooks().add(books.get(4)); // Петров взял книгу с индексом 4
        readers.get(2).getBooks().add(books.get(0)); // Сидоров взял Оруэлла
        readers.get(2).getBooks().add(books.get(2)); // Сидоров взял Tolkien
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reviews> getReviews(){
        return reviews;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
