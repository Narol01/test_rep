package practice;

import java.util.Arrays;
import java.util.Random;

public class change {
    public static void main(String[] args) {
        int[] value = new int[20];
        Random random = new Random();
        for (int i = 0; i < value.length; i++) {
            int numb = random.nextInt(10,20);
            value[i] = numb;
        }
        //Строка выводящая содержимое массива
        System.out.println(Arrays.toString(value));

        System.out.println(" ");
        int revers = value[0];
        value[0]=value[value.length - 1];
          value[value.length -1]=revers;
        System.out.println(Arrays.toString(value));
    }
}
