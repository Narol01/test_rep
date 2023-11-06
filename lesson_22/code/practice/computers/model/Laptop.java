package practice.computers.model;

import java.util.Objects;

public class Laptop extends Computer {

    private String display;
    private int batteryCapacity;
    private double weight;

    public Laptop(String cpu, int ram, int hdd, String brand,  String display, int batteryCapacity, double weight) {
        super(cpu, ram, hdd, brand );
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
        return super.toString()+
                "\ndisplay= " + display +
                "\nbatteryCapacity= " + batteryCapacity +
                "\nweight= " + weight;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Laptop laptop)){
        return false;
        }
        return super.equals(laptop) && batteryCapacity == laptop.batteryCapacity && Double.compare(weight, laptop.weight) == 0 && Objects.equals(display, laptop.display);
    }
}
