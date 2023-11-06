package practic;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your drink, \n when 1-Americano 2-latte 3-Cappuccino 4-Espresso");
        int num= scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("Your choice Americano,so pay 1 euro");
            case 2 -> System.out.println("Your choice Latte,so pay 2 euro");
            case 3 -> System.out.println("Your choice Cappuccino,so pay 1 euro");
            case 4 -> System.out.println("Your choice Espresso,so pay 1 euro");
            default -> System.out.println("Choose your drink again pls");
        }

    }
}
