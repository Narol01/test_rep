package homework;

import java.util.Random;
import java.util.Scanner;

public class HappyPel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int index= random.nextInt(0,29);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(25, 35);
        }
        change(numbers,index);
        printArray(numbers);
        split();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 35) {
                System.out.println("Happy dumpling hid by index "+ i);
            }
        }
    }
    public static void change(int[] arr, int index){
        arr[index]+=15;
    }
    public static void split(){
        System.out.println("-------------------------------");
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
