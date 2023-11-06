package homework.model;

public class Triangle extends Shape{

    public Triangle(String typeOfShape, double countSide) {
        super(typeOfShape, countSide);
    }

    @Override
    public double calcArea() {
        double area = countSide*countSide*Math.sqrt(3.00/4.00) ;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter=countSide*3;
        return perimeter;
    }
}
