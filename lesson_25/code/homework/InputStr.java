package homework;

import java.util.Arrays;
import java.util.Scanner;

public class InputStr {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter text");
        String str =scanner.nextLine();
        System.out.println("Your text is - '"+str+"'");
        String[] words=str.split(" ");
        System.out.println("Quantity of words in string "+words.length);
        String[] symbol=str.split("");
        System.out.println("Quantity of symbol in string "+symbol.length);
        String[] symbol1=new String[words.length];
        for (int i = 0; i < words.length; i++) {
            symbol1[i] = words[words.length - i - 1];//Разворот массива
        }
        System.out.println(Arrays.toString(symbol1));

        String[] symbol2=new String[symbol.length];
        for (int i = 0; i < symbol.length; i++) {
            symbol2[i] = symbol[symbol.length - i - 1];//Разворот массива
        }
        System.out.println(Arrays.toString(symbol2));
    }
}
