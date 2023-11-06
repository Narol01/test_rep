package practice.computers.model;

public class Handy extends Laptop {
    private String camera;
    private long imei;

    public Handy(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, String camera, long imei) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.camera = camera;
        this.imei = imei;
    }

    public long getImei() {
        return imei;
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
                "\ncamera= " + camera + "\nIMEI: " + imei;
    }
}
