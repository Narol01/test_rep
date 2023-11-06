package practice.computer.model;

import practice.computer.model.Computer;

import java.util.Objects;

public class Laptop extends Computer {

    private String display;
    private int batteryCapacity;
    private double weight;

    public Laptop(String serialnumber, String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight) {
        super(serialnumber, cpu, ram, hdd, brand);
        this.display = display;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "display='" + display + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                '}';
    }
}

