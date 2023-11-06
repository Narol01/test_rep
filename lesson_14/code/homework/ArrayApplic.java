package homework;

import java.util.Random;
import java.util.Scanner;

public class ArrayApplic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }//Определить элементы масива
        BubbleSorty.printArray(numbers);
        BubbleSorty.sort(numbers);
        BubbleSorty.printArray(numbers);
    }
}
