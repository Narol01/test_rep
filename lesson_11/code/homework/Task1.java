package homework;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-10, 10);
        }
        System.out.println("Array:\n" + Arrays.toString(mas));
        int sum = sumMass(mas);
        System.out.println("Sum of odd array elements: " +sum);

    }
    public static int sumMass(int[] mas){
        int sum=0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]%2 != 0) {
                sum+=mas[i];
            }
        }
        return sum;
    }

}

