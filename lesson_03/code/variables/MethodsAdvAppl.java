package variables;

public class MethodsAdvAppl {
    public static void main(String[] args) {
        //Длинна окружности L = 2 * pi * r
         double constanta = pi();
         double rad = R();
        // System.out.println(constanta);
        PrintPi(constanta);
        PrintR(rad);
        double res = circleLengs(rad); // в скобках - это радиус окружности
        System.out.println("l=" + res);
    }
    public static double circleLengs(double r){
        double l = 2 * pi() * r;
        return l;

    }
    public static void PrintPi(double p){
        System.out.println("Pi=" + p);

    }
    public static void PrintR(double radius) {
        System.out.println("Radius=" + radius);
    }
    public static double pi(){
        double pi = 3.1415925; // double = метод должен вернуть такой тип
        return pi;
    }
    public static double R(){
        double R = 110;
        return R;
    }
}
