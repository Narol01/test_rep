package practice;

public class returnCube {
    public static void main(String[] args) {
        double a = 2.5;
        double c = cube(a ,3);
        System.out.println("Volume of a Cube =" + c);
       double d = areaCube(a);
        System.out.println("Area of a Cube =" + d);
//        Площадь треугольника S = 0.5 * a *h
        double S = areaTria(10, 10);
        System.out.println("Area of a Triagle =" + S);
    }
    public static double cube(double a,double b){
        return Math.pow(a,b);
    }
    public static double areaCube(double a){
        return 6 * (a*a);
    }
    public static double areaTria(double a,double h){
        return 0.5 * a * h;
    }

}
