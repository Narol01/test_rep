package homework.model;

public class Square extends Shape{
    public Square(String typeOfShape, double countSide) {
        super(typeOfShape, countSide);
    }

    @Override
    public double calcArea() {
        double area= countSide*countSide;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter= 4*countSide;
        return perimeter;
    }
}
