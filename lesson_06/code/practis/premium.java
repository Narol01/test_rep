package practis;

import java.util.Scanner;

public class premium {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input years : ");
        int years = scanner.nextInt();
        double salary = 500;
        switch (years){
            case 1,2,3 -> {
                System.out.println("Your salary: " +  (salary+salary*0.10) );
            }
            case 4,5 -> {
                System.out.println("Your salary: " +  (salary+salary*0.50) );
            }
            case 6,7,8,9,10 -> {
                System.out.println("Your salary: " +  (salary+salary*1) );
            }
            case 11,12,13,14,15 -> {
                System.out.println("Your salary: " +  (salary+salary*1.50) );
            }
            default -> {
                System.out.println("If you indicated for more than 15 years tour salary: " + (salary+salary*1.50) );
                System.out.println("If no,then input was incorrect" );
            }

        }

    }
}
