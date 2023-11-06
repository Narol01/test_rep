package practice.book;

import practice.book.model.Book;
import practice.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
//        Book book1=new Book("New Oxford Spelling Dictionary","by Oxford Languages",2014,"0199569991");
//        Book book2=new Book("A grammatical dictionary of the English language","by Karl",2008,"1110731221");
//        Book book3=new Book("Merriam Webster's Dictionary of Synonyms","by Merriam-Webster",1984,"0877793417");
        Dictionary di1=new Dictionary("New Oxford Spelling Dictionary","by Oxford Languages",2014,
                "0199569991","Spelling",596,true);
        Dictionary di2=new Dictionary("A grammatical dictionary of the English language","by Karl",2008,
                "1110731221","Grammatical",148,true);
        Dictionary di3=new Dictionary("Merriam Webster's Dictionary of Synonyms","by Merriam-Webster",1984,
                "0877793417","Dictionary of Synonyms",940,false);

        di1.display();
        System.out.println("-------------------------------");
        di2.display();
        System.out.println("-------------------------------");
        di3.display();
        System.out.println("-------------------------------");
    }
}
