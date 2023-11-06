package practic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your text:");
        String Line = scanner.nextLine();
        System.out.println("Input number of lines:");
        int num = scanner.nextInt();
        int counter = 0;
        while (counter<num){
            System.out.println(Line);
            counter++;
        }
    }
}
