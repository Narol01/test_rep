package practic;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
         while(n<24) {
            System.out.println("Input time of day (0-24)");
            int num = scanner.nextInt();
            while (n<24){
            if (num < 6 & num > 0) {
                System.out.println("Time of day:Early morning \n Wake up, Wake up");
            }
            if (num < 12 & num >= 6) {
                System.out.println("Time of day: morning \n Good Morning");
            }
            if (num < 18 & num >= 12) {
                System.out.println("Time of day: afternoon \n Good Afternoon");
            }
            if (num < 24 & num >= 18) {
                System.out.println("Time of day: Evening \n Good Evening");
            }
            if (num < 0 | num >= 24) {
                System.out.println("You are finish");
                return;
            }
            break;
            }
        }

    }
}
