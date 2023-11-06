package practice.computer.model;

import java.util.Objects;

public class Computer {
    protected String serialnumber;
    protected String cpu;
    protected int ram;
    protected int hdd;
    protected String brand;

    public Computer(String serialnumber, String cpu, int ram, int hdd, String brand) {
        this.serialnumber = serialnumber;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(serialnumber, computer.serialnumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialnumber);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialnumber='" + serialnumber + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                '}';
    }
}