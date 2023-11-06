package homework;

import homework.model.Circle;
import homework.model.Shape;
import homework.model.Square;
import homework.model.Triangle;
import practice.employee_firma.model.Employee;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
         shapes[0]= new Circle("Circle",5);
         shapes[1]=new Triangle("Triangle",5);
         shapes[2]= new Circle("Circle",5);
         shapes[3]= new Square("Square",5);
        System.out.printf("Total Area = %.2f",totalArea(shapes));
        System.out.printf("\nTotal Area Circle = %.2f",totalCirArea(shapes));
        System.out.printf("\nTotal Perimeter = %.2f",totalPer(shapes));
    }
    private static double totalArea(Shape[] schape){
        double sum = 0;
        for (int i = 0; i < schape.length; i++) {
            if(schape[i] != null){
                sum += schape[i].calcArea();
            }
        }
        return sum;
    }
       private static double totalCirArea(Shape[] schape){
        double sum = 0;
        for (int i = 0; i < schape.length; i++) {
            if(schape[i] instanceof Circle){
                sum += schape[i].calcArea();
            }
        }
        return sum;
    }

        private static double totalPer(Shape[] schape){
        double sum = 0;
        for (int i = 0; i < schape.length; i++) {
            if(schape[i] != null){
                sum += schape[i].calcPerimeter();
            }
        }
        return sum;
    }
}
