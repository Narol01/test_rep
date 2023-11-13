package homework.Book;

import homework.Book.model.Roman;
import practice.bus.Bus;

import java.util.ArrayList;
import java.util.List;

public class BookAppl {
    public static void main(String[] args) {
        List<Roman> listBook=new ArrayList<>();
        listBook.add(new Roman("Белые ночи","Достоевский",1848,"101"));
        listBook.add(new Roman("Портрет Дориана Грея ","Оскар Уайльд",1890,"213"));
        listBook.add(new Roman("Oxford Spelling Dictionary","by Oxford",2014, "124"));
        listBook.add(new Roman("Записки мёртвого дома","Достоевский",1848,"102"));
        listBook.add(new Roman("Золотой жук","Эдгар Алан По",1843,"543"));
        listBook.add(new Roman("В поисках утраченого времени","Марсель Пруст",1913,"154"));

        System.out.println(listBook.size());
        System.out.println("Is Empty? - " + listBook.isEmpty());
        System.out.println(listBook);//простая черновая печать

        listBook.sort(Roman::compareTo);
        System.out.println("--------------Sorted List-----------");
        System.out.println(listBook);
        System.out.println("----------------Sum bus Capacity");
        int totalCapacity = 0;
        int c=0;
        for (Roman b : listBook) {
            c++;
            totalCapacity += b.getYear();
        }
        System.out.println("AvgCapacity - "+totalCapacity/c);

    }
}
