package homework;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-10, 10);
        }
        System.out.println("Array:\n" + Arrays.toString(mas));
        double proiz = arrayP(mas);
        System.out.println("Product of elements with even indices:" + proiz);
    }

    public static double arrayP(int[] mas){
        double proizvod=1;
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 0){
                proizvod *=mas[i];
            }
        }
        return proizvod;
    }
}
