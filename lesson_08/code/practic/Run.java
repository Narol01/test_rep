package practic;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how much kilometer can you run");
        double s = scanner.nextInt();
        System.out.println("Input how much kilometer want you run");
        int target  = scanner.nextInt();
        double day= 0;
        while (s < target) {
            s = s + s * 0.1;
            day++;
        }
        System.out.println("You can run " + target + " kilometers through " + day + " days");
    }
}
