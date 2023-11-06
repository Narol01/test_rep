package practic;

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from your ticket\n(The number consist of 6 digits)");
        int ticket = scanner.nextInt();
        System.out.println("Your number is: " + ticket);
        int sum = 0;
        double counter = 0;
        while (ticket > counter) {
            sum = sum + (ticket % 1000);
            ticket /= 1000;
            System.out.println("The 2nd part of your ticket number: " + sum);
            if(ticket==ticket){
            break;}
        }
        int res = 0;
        while (sum != 0) {
            res = res + (sum % 10);
            sum /= 10;
        }
        System.out.println("Sum of digital from 2 nd part is: " + res);

        while (ticket > counter) {
            sum = sum + (ticket % 1000);
            ticket /= 1000;
        }
        System.out.println("The 1st part of your ticket number: " + sum);

        int res2 = 0;
        while (sum != 0) {
            res2 = res2 + (sum % 10);
            sum /= 10;
        }
        System.out.println("Sum of digital from 1st part is: " + res2);
        if (res==res2){
            System.out.println("Congratulations\ud83c\udf8a\ud83c\udf8a , you got a lucky ticket");
        }
        else{
            System.out.println("Don`t worry\u263a\ufe0f\u263a\ufe0f ,better luck next time");
        }
    }
}
