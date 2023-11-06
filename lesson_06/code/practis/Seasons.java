package practis;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month:");
        int num = scanner.nextInt();
        int ost = ostat(num);

        switch (ost){
            case 1 -> System.out.println("Your month is January and this Winter ");
            case 2 -> System.out.println("Your month is February and this Winter");
            case 3 -> System.out.println("Your month is March and this Spring");
            case 4 -> System.out.println("Your month is April and this Spring");
            case 5 -> System.out.println("Your month is May and this Spring");
            case 6 -> System.out.println("Your month is June and this Summer");
            case 7 -> System.out.println("Your month is July and this Summer");
            case 8 -> System.out.println("Your month is August and this Summer");
            case 9 -> System.out.println("Your month is September and this Autumn");
            case 10 -> System.out.println("Your month is October and this Autumn");
            case 11 -> System.out.println("Your month is November and this Autumn");
            case 12 -> System.out.println("Your month is December and this Winter");
            case 0 -> System.out.println("Your month is December and this Winter");

            default -> System.out.println("Input was incorrect");
        }
    }
    public static int ostat(int a){
        return a%12;
    }
}
