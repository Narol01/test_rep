package practis;

import java.util.Scanner;

public class TerOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
         Scanner scanner = new Scanner(System.in); //включаем считывание с клавиатуры
        System.out.println("Input first number: ");
        int number1 = scanner.nextInt(); // получение числа с клавиатуры
        System.out.println("Input 2nd number: ");
        int number2 = scanner.nextInt(); // получение числа с клавиатуры

        int curs = (a < b) ? a : b;
        int cur2 = (number1 < number2) ? number1 : number2;
        System.out.println(curs);
        System.out.println(cur2);
    }
}
