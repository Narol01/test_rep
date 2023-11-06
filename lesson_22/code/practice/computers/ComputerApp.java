package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Handy;
import practice.computers.model.Laptop;

public class ComputerApp {
    public static void main(String[] args) {

        Computer[] comp = new Computer[4];
        comp[0] = new Computer("serialnumber", 16, 512, "ASUS");
        comp[1] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 2);
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);
        comp[3] = new Handy("A15", 4, 128, "iPhone", "6.1", 3095, 0.164, "12MP", 123456789098L);
        Computer computer=new Computer("serialnumber", 16, 512, "ASUS");
        Handy handy = new Handy("A15", 4, 128, "iPhone", "6.1", 3095, 0.164, "12MP", 123456789098L);
        printArray(comp);
        boolean checkker= comp[3].equals(handy);
        System.out.println(checkker);
        System.out.println("_________________________________");
        boolean checker=comp[0].equals(computer);
        System.out.println(checker);
        System.out.println("_________________________________");
        boolean cheker=comp[1].equals(comp[2]);
        System.out.println(cheker);

    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
                System.out.println("_________________________________");
            }
        }
    }
}