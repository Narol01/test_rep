package homework;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-10, 10);
        }
        System.out.println("Array:\n" + Arrays.toString(mas));
        int[] mass=array(mas);
        System.out.println("Revers array:\n" + Arrays.toString(mass));

    }
    public static int[] array(int[] revers){
        int[] mas=new int[revers.length];
        for (int i = 0; i < revers.length; i++) {
            mas[i]=revers[revers.length-i-1];
        }
        return mas;
    }
}
