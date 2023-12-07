package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String numStr=Integer.toString(number);

        String[] listStr = numStr.split("");
        int[] numbers = new int[listStr.length];
        for (int i = 0; i < listStr.length; i++) {
            numbers[i] = Integer.parseInt(listStr[i]);
        }

        double res=0;
        double rek=1;
        for (int i = 0; i < listStr.length; i++) {
            rek= Math.pow(numbers[i], listStr.length);
            res+=rek;
        }

        if(res==number){
            return true;
        }
        return false;
    }

    public static boolean isNarcissistic1(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }
}
