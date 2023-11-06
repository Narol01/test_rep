package practice;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n: ");
        int n =scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum+=1/i;
        }
        System.out.println("Sum= "+ sum);
    }
}
