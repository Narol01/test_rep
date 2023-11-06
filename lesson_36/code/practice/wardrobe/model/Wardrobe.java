package practice.wardrobe.model;

import java.util.Objects;

public class Wardrobe implements Comparable<Wardrobe> {
    double height;
    double width;
    double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double area(){
        return width*depth;
    }
    public double volume(){
        return height*area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wardrobe wardrobe = (Wardrobe) o;
        return Double.compare(height, wardrobe.height) == 0 && Double.compare(width, wardrobe.width) == 0 && Double.compare(depth, wardrobe.depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, depth);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public int compareTo(Wardrobe o) {
        return Double.compare(height,o.height);
    }
}
