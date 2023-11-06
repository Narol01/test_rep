package practic;

import java.util.Scanner;

public class TheaterTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int age = scanner.nextInt();
        System.out.println("Are you Student? \n(true or false)");
        boolean stu = scanner.nextBoolean();
        System.out.println("Do you want to buy VIP seats? \n(true or false)");
        boolean vip = scanner.nextBoolean();
        double price = 15;
        double n=0;
        double m=0;
        double s=0;

        double pro =calculateTicketPrice(age,stu,vip,price,n,m,s);
        System.out.println("Your ticket will stand: " + (price+pro));

    }
    public static double calculateTicketPrice(double age, boolean stu,boolean vip,double price,double n,double m,double s) {
        if (age >= 65){n=(price) * 0.25;
        return n;}
        if (stu){m=(price)*0.10;
        return m;}
        if (vip){s=(price)*0.25;
        return s;}
        return -n-m+s;
    }
}
