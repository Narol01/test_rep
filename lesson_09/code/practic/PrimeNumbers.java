package practic;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number");
        int num = scanner.nextInt();
        System.out.println("Your number is: " + num);
        boolean isPrime=true;
         int s = 2;
         while (s < num){
             if(num%s==0){
                 isPrime=false;
             }
             s++;
         }
         System.out.println(num + " is prime " + isPrime);
    }
}
