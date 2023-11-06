package practic;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the year ");
        int year = scanner.nextInt();
        System.out.println("Choose the month ");
        int mont = scanner.nextInt();
        int month = ostat(mont);
        int s = rest(year);
        int d = ree(year);
        int g = ret(year);
        if (s == 0 & g != 0 | g == 0 & d == 0) {
            if (month == 1) {System.out.println("Your month January,it has 31 days");}
            if (month == 2) {System.out.println("Your month February,it has 29 days");}
            if (month == 3) {System.out.println("Your month March,it has 31 days");}
            if (month == 4) {System.out.println("Your month April,it has 30 days");}
            if (month == 5) {System.out.println("Your month Mai,it has 31 days");}
            if (month == 6) {System.out.println("Your month June,it has 30 days");}
            if (month == 7) {System.out.println("Your month July,it has 31 days");}
            if (month == 8) {System.out.println("Your month August,it has 31 days");}
            if (month == 9) {System.out.println("Your month September,it has 30 days");}
            if (month == 10) {System.out.println("Your month October,it has 31 days");}
            if (month == 11) {System.out.println("Your month November,it has 30 days");}
            if (month == 12) {System.out.println("Your month December,it has 31 days");}
            if (month == 0) {System.out.println("Your month December,it has 31 days");}
        } else {
            if (month == 1) {System.out.println("Your month January,it has 31 days");}
            if (month == 2) {System.out.println("Your month February,it has 28 days");}
            if (month == 3) {System.out.println("Your month March,it has 31 days");}
            if (month == 4) {System.out.println("Your month April,it has 30 days");}
            if (month == 5) {System.out.println("Your month Mai,it has 31 days");}
            if (month == 6) {System.out.println("Your month June,it has 30 days");}
            if (month == 7) {System.out.println("Your month July,it has 31 days");}
            if (month == 8) {System.out.println("Your month August,it has 31 days");}
            if (month == 9) {System.out.println("Your month September,it has 30 days");}
            if (month == 10) {System.out.println("Your month October,it has 31 days");}
            if (month == 11) {System.out.println("Your month November,it has 30 days");}
            if (month == 12) {System.out.println("Your month December,it has 31 days");}
            if (month == 0) {System.out.println("Your month December,it has 31 days");}
        }
    }

    public static int rest(int y) {
        return y % 4;
    }

    public static int ree(int y) {
        return y % 400;
    }

    public static int ret(int y) {
        return y % 100;
    }

    public static int ostat(int a) {
        return a % 12;
    }
}


