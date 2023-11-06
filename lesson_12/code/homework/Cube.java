package homework;

import java.util.Random;

public class Cube {
    public static void main(String[] args) {
        Random random = new Random();
        int[] cube=new int[20];
        int n;

        for (int i = 0; i < cube.length; i++) {
            cube[i] = random.nextInt(1,7);
        }
        printArray(cube);
        int number1 = 0;//элементы в котрые идет подсчет
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;

        for (int i = 0; i < cube.length; i++) {
            switch (cube[i]){
                case 1 -> number1++;//Счётчик
                case 2 -> number2++;
                case 3 -> number3++;
                case 4 -> number4++;
                case 5 -> number5++;
                case 6 -> number6++;
            }
        }
            System.out.println("number 1: " +number1+" ");//Вывод подсчитаных чисел
            System.out.println("number 2: " +number2+" ");
            System.out.println("number 3: " +number3+" ");
            System.out.println("number 4: " +number4+" ");
            System.out.println("number 5: " +number5+" ");
            System.out.println("number 6: " +number6+" ");
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
