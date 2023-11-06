package practic;

import java.util.Scanner;

public class color {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input the color from the traffic light ");
        String color =scanner.next();

        switch (color){
            case "green" -> System.out.println("GO!" + "\ud83d\udfe2");
            case "yellow" -> System.out.println("Wait" + "\ud83d\udfe1");
            case "red" -> System.out.println("STOP!!" + "\ud83d\udd34");
        }
    }
}
