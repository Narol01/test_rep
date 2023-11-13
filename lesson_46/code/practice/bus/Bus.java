package practice.bus;

import java.util.Objects;

public class Bus implements Comparable<Bus> {
    private String model;
    private String reg;
    private String route;
    private int busCapacity;

    public Bus(String model, String reg, String route, int busCapacity) {
        this.model = model;
        this.reg = reg;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "\nBus{" +
                "model='" + model + '\'' +
                ", reg='" + reg + '\'' +
                ", route='" + route + '\'' +
                ", busCapacity=" + busCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(reg, bus.reg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reg);
    }

    @Override
    public int compareTo(Bus o) {
        int res=this.route.compareTo(o.route);
        return res != 0 ? res : -Integer.compare(this.busCapacity,o.busCapacity);
    }
}
