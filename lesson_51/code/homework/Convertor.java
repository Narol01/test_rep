package homework;

import java.util.Currency;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Convertor {
    public static void main(String[] args) {
        Money[] currency = Money.values();
        for (Money m : currency) {
            System.out.println(m);
        }
        Set<String> curr = new HashSet<>();

        for (int i = 0; i < currency.length; i++) {
            if (curr.add(currency[i].getName())) {
                System.out.println(currency[i].getName() + " added.");
            }
        }

        System.out.println("Menu : ");
        for (int i = 0; i < currency.length; i++) {
            System.out.println(i + 1 + ": " + currency[i].getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of currency: ");
        int currNumber = scanner.nextInt();
        System.out.println("Input amount of money: ");
        int sum = scanner.nextInt();

        switch (currNumber) {
            case 1 -> {
                double course = Money.USD.getCourse();
                double res = course * sum;
                System.out.printf("You got: %.2f", res);
                System.out.println(" euro.");
            }
            case 2 -> {
                double course = Money.UAN.getCourse();
                double res = course * sum;
                System.out.printf("You got: %.2f", res);
                System.out.println(" euro.");
            }
            case 3 -> {
                double course = Money.RUB.getCourse();
                double res = course * sum;
                System.out.printf("You got: %.2f", res);
                System.out.println(" euro.");
            }
        }
    }
}
