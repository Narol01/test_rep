package practic;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number");
        int num = scanner.nextInt();
        System.out.println("Your number is: " + num);
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        System.out.println("Sum of digital is: " + sum);


    }
}

