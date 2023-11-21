package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers10 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of numbers to be entered: ");
        int numberOfNumbers = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода числа

        Set<Integer> numbers = new HashSet<>();

        // Цикл для ввода чисел
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.print("Enter land name " + (i + 1) + ": ");
            int num = scanner.nextInt();
           if(num<=10) {
                if(numbers.add(num)) {
                    System.out.println("Number is added.");
                } else {
                    System.out.println("Number exists.");
               }
           }
           else {
               System.out.println("Number greater than 10 - deleted.");
           }
        }
        System.out.println("Show numbers: ");
        for (int s:numbers){
            System.out.print(s+", ");
        }


        //Или же удалить числа больше 10 непосредственно из множества чисел
//        for (int n : numbers) {
//            if(n >= 10){
//                numbers.remove(n);
//            }
//        }
//
//        System.out.println("Show numbers: ");
//        System.out.println(numbers);
    }
}