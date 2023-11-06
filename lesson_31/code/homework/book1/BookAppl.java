package homework.book1;

import homework.book1.model.Book;
import homework.book1.model.Dictionary;
import homework.book1.model.Roman;

public class BookAppl {
    public static void main(String[] args) {
        Book[] book=new Book[6];
         book[3]=new Roman("Белые ночи","Достоевский",1848,"101");
         book[4]=new Roman("Портрет Дориана Грея ","Оскар Уайльд",1890,"213");
         book[0]=new Dictionary("New Oxford Spelling Dictionary","by Oxford Languages",2014,
                "124","Spelling",596);
         book[1]=new Dictionary("A grammatical dictionary of the English language","by Karl",2008,
                "345","Grammatical",148);
         book[2]=new Dictionary("Merriam Webster's Dictionary of Synonyms","by Merriam-Webster",1984,
                "764","Dictionary of Synonyms",940);
    }
}
