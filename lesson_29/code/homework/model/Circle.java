package homework.model;

public class Circle extends Shape {


    public Circle(String typeOfShape, double countSide) {
        super(typeOfShape, countSide);
    }


    @Override
    public double calcArea() {
       double area=3.14*(countSide * countSide);
       return area;
    }

    @Override
    public double calcPerimeter() {
        double perimetr=2*3.14* countSide;
        return perimetr;
    }
}
