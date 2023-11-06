package homework.model;

import java.util.Objects;

public abstract class Shape {

    protected String typeOfShape;
    protected double countSide;

    public Shape(String typeOfShape, double countSide) {
        this.typeOfShape = typeOfShape;
        this.countSide = countSide;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public double getCountSide() {
        return countSide;
    }

    public void setCountSide(double countSide) {
        this.countSide = countSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(typeOfShape, shape.typeOfShape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfShape);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Shape");
        sb.append("Type:").append(typeOfShape);
        sb.append("Side =").append(countSide);
        return sb.toString();
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();
}
