package homework;

import java.util.Random;
import java.util.Scanner;

public class ArrayCh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
//        int n = scanner.nextInt();
        int[] numbers = {52, 45, 27, 56, 55, 79, 71, 61, 36, 96 };
        TaskMetods.bubbleSort(numbers);
        TaskMetods.printArray(numbers);
        System.out.println("Enter the number you want to find and replace ");
        int n =scanner.nextInt();
//         System.out.println("Enter the 2nd number you want to find and replace ");
//        int a =scanner.nextInt();

        int index = TaskMetods.binarySearch(numbers, n);
        //TaskMetods.printArray(numbers);
        System.out.println("Index as a result of binary search = " +index);
        TaskMetods.split();

        int[] number = {33, 47, 32, 39, 22, 44, 20, 48, 31, 38 };
        TaskMetods.bubbleSort(number);
        TaskMetods.printArray(number);
        System.out.println("Enter the 2nd number you want to find and replace ");
        int a =scanner.nextInt();
        int index2 = TaskMetods.binarySearch(number, a);
        //TaskMetods.printArray(numbers);
        System.out.println("Index as a result of binary search = "+index2);
        TaskMetods.split();

        TaskMetods.change(numbers,number,index,index2);
        TaskMetods.bubbleSort(numbers);
        TaskMetods.printArray(numbers);
        int indexD = TaskMetods.binarySearch(numbers, a);
        System.out.println("New index "+ a +" after replacement = "+indexD);
        TaskMetods.split();
        TaskMetods.bubbleSort(number);
        TaskMetods.printArray(number);
        int indexdi = TaskMetods.binarySearch(number, n);
        System.out.println("New index "+ n +" after replacement = "+indexdi);
    }
}
