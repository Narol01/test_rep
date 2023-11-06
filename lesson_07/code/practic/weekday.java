package practic;

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of day(two first letter of day):");
        String dayOfWeek = scanner.next();

        switch (dayOfWeek){
            case "Mo" -> System.out.println("This is Monday");
            case "Tu" -> System.out.println("This is Tuesday");
            case "We" -> System.out.println("This is Wednesday");
            case "Th" -> System.out.println("This is Thursday");
            case "Fr" -> System.out.println("This is Friday");
            case "Sa" -> System.out.println("This is Saturday");
            case "Su" -> System.out.println("This is Sunday");
            default -> System.out.println("Wrong operation!!!");
        }
    }
}
