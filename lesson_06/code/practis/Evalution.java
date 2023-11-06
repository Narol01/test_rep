package practis;

import java.util.Scanner;

public class Evalution {
    public static void main(String[] args) {

        int timeForGame= 60; // сколько разрешено играть

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input todays mark: ");
        int mark = scanner.nextInt();
        switch (mark) {
            case 1 -> {
                System.out.println("Good child!!");
                timeForGame = timeForGame + 30;
                System.out.println("Time for Game =" + timeForGame + " min");
            }
            case 2 -> {
                System.out.println("Good");
                System.out.println("Time for Game =" + timeForGame + " min");
            }
            case 3 -> {
                System.out.println("not so good");
                timeForGame = timeForGame - 30;
                System.out.println("Time for Game =" + timeForGame + " min");
            }
            case 4 -> {
                System.out.println("Bad,without Computer Games");
                timeForGame = 0;
                System.out.println("Time for Game =" + timeForGame + " min");
            }
            case 5 -> System.out.println("Shame,without Computer Games for 2 days");
            default -> System.out.println("Not funny");
        }
    }
}
