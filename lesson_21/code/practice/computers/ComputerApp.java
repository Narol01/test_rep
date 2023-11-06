package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Handy;
import practice.computers.model.Laptop;

public class ComputerApp {
    public static void main(String[] args) {

        Computer[] comp = new Computer[4];
        comp[0] = new Computer("i9", 16, 512, "ASUS");
        System.out.println("_________________________________");
        comp[1] = new Laptop("i5", 8, 256, "acer", "14", 5000, 2);
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);
        comp[3] = new Handy("A15", 4, 128, "iPhone", "6.1", 3095, 0.164, "12MP", 123456789098L);

        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] != null) {
                sumHdd += comp[i].getHdd();
            }
        }
        double batt = getTotalBatteryLife(comp);
        double battery = getTotalBattery(comp);
        double hdd=getTotalHhd(comp);
        printArray(comp);
        System.out.println("Total Battery Laptop= " + battery);
        System.out.println("Battery only Laptop= " + batt);
        System.out.println("HDD only Laptop= " + hdd);
        System.out.println("Total HDD= " + sumHdd);
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
                System.out.println("_________________________________");
            }
        }
    }

    public static double getTotalBatteryLife(Object[] arr) {
        double sumbatt1 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                Laptop laptop = (Laptop) arr[i];
                sumbatt1 += laptop.getBatteryCapacity();
            }
            if (arr[i] instanceof Handy) {
                Laptop laptop = (Laptop) arr[i];
                sumbatt1 -= laptop.getBatteryCapacity();
            }
        }
        return sumbatt1;
    }

    public static double getTotalBattery(Object[] arr) {
        double sumbatt1 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                Laptop laptop = (Laptop) arr[i];
                sumbatt1 += laptop.getBatteryCapacity();
            }
        }
        return sumbatt1;
    }

    public static double getTotalHhd(Object[] arr) {
        double sumhdd1 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                Laptop laptop = (Laptop) arr[i];
                sumhdd1 += laptop.getHdd();
            }
            if (arr[i] instanceof Handy) {
                Laptop laptop = (Laptop) arr[i];
                sumhdd1 -= laptop.getHdd();
            }
        }
        return sumhdd1;
    }
}
