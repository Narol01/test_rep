package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }//Определить элементы масива
        ArrayMetods.printArray(numbers);
        BubbleSort.bubbleSort(numbers);
        ArrayMetods.printArray(numbers);
        ArrayMetods.split();
        int[] array={-12,5,36,28,-16,100,82,64,57,5};
        ArrayMetods.printArray(array);
        BubbleSort.bubbleSort(array);
        ArrayMetods.printArray(array);
    }
}
