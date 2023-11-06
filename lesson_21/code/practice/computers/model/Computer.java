package practice.computers.model;

public class Computer {

    private String cpu;
    private int ram;
    private int hdd;
    private String brand;

    public Computer(String cpu, int ram, int hdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\ncpu= " + cpu +
                "\nram=" + ram +
                "\nhdd=" + hdd +
                "\nbrand=" + brand;
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
}
