package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StateOfGermany {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of state names in Germany: ");
            int numberOfStates = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            Set<String> names = new HashSet<>();

            // Цикл для ввода названий земель
            for (int i = 0; i < numberOfStates; i++) {
                System.out.print("Enter land name " + (i + 1) + ": ");
                String state = scanner.nextLine();
                names.add(state);
            }

            for (String s:names){
                System.out.print(s+", ");
            }
        }
}