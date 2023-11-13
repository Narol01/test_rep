package homework.sports;

import homework.Book.model.Roman;

import java.util.ArrayList;
import java.util.Scanner;

public class AthleteAppl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Athlete> athletes=new ArrayList<>();
       while (true){
            System.out.println("Input Lastname");
            String lastname = scanner.next();
            System.out.println("Input Name");
            String name = scanner.next();
            System.out.println("Input RegNumber");
            int regNumber = scanner.nextInt();
            System.out.println("Input Club");
            String club = scanner.next();
            System.out.println("Input Result in seconds");
            int resultInSeconds = scanner.nextInt();
            Athlete athlete=new Athlete(lastname, name, regNumber, club, resultInSeconds);
            athletes.add(athlete);
           athletes.sort(Athlete::compareTo);
           System.out.println("--------------Sorted List-----------");
           System.out.println(athletes);
           System.out.println("\nAdd more \n yes-to continue \n no-complete");
           String a = scanner.next();
           if (a.equals("no")) {
               break;
           }
        }
    }
}
