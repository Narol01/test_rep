package practice.computers.model;

public class Handy extends Laptop1 {
    private String camera;

    public Handy(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, String camera) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString()+"\nHandy:" +
                "\ncamera= " + camera;
    }
}
