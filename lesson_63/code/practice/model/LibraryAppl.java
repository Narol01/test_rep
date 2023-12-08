package practice.model;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library();
        library.getBooks().forEach(System.out::println);

        library.getReaders().forEach(System.out::println);

        System.out.println("----------Books unsorted--------------");
        library.getBooks().forEach(System.out::println);
        System.out.println("----------Books sorted--------------");
        List<Book> listBookByYearsIssue = library.getBooks().stream().sorted(Comparator.comparing(Book::getIssueYear)).toList();
        listBookByYearsIssue.forEach(System.out::println);
        System.out.println("----------Books sorted--------------");
        ArrayList<Email> emailList = new ArrayList<>();
        for (Reader reader : library.getReaders()) {
            emailList.add(new Email(reader.getEmail()));
        }
        emailList.forEach(System.out::println);

       /* List<Email> emailList2=library.getReaders().stream()
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();*/
        System.out.println("----------MAiling LIst Subscribed Users--------------");
        List<Email> subscribed = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();
        subscribed.forEach(System.out::println);
        System.out.println("-------------List of Books----------");
        List<Book> rentedBooks = library.getReaders().stream()
                .flatMap(r -> r.getBooks().stream())
                .distinct()
                .toList();
        rentedBooks.forEach(System.out::println);
        System.out.println("-----------Max book rented-------------");
        int maxBooks = library.getReaders().stream()
                .mapToInt(r -> r.getBooks().size())
                .max()
                .orElse(0);
        System.out.println(maxBooks);

        System.out.println("--------------eeeeeeeeeeeeiiii----------------");
        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) {
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) {
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new Email(reader.getEmail()));
                }
            }
        }
        // Print keys and values - проход по всем ключам и их значениям/
        for (String key : result.keySet()) {
            System.out.println("key: " + key + " value: " + result.get(key));
        }
        System.out.println("----------------------------------");
        System.out.println(result.entrySet());
        System.out.println("===================================");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(r -> r.getBooks().size() > 2 ? "TOO MUCH" : "OK",
                        mapping(r -> new Email(r.getEmail()), Collectors.toList())));
        System.out.println(map.entrySet());

        boolean check=checkBook(library ,"George Orwell");
        System.out.println(check);


    }//end of main

    private static boolean checkBook(Library library, String s) {
boolean match = library.getReaders().stream()
        .flatMap(r->r.getBooks().stream())
        .anyMatch(book->s.equals(book.getAuthor()));
return match;
    }

}//end of class
