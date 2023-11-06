package variables;

public class HomeworkCircle {
    public static void main(String[] args) {
        //Площадь круга S = Pi * r^2
        double constanta = pi();
        double rad = R();
        PrintPi(constanta);
        PrintR(rad);
        double res = circleArea(10); // в скобках - это радиус окружности
        System.out.println("Sc=" + res);
    }
    public static double circleArea(double r){
        return pi() * (r*r);

    }
    public static void PrintPi(double p){
        System.out.println("Pi=" + p);

    }
    public static void PrintR(double radius) {
        System.out.println("Radius=" + radius);
    }
    public static double pi(){
        return 3.1415925;
    }
    public static double R(){
        return 10;
    }
}
