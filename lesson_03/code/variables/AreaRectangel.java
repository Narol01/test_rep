package variables;

public class AreaRectangel {
    public static void main(String[] args) {
        //Площадь прямоугольника S = A * B
        double S = areaRec(23, 12);
        PrintRes(S);
    }
    public static double areaRec(double a, double b){
        return a * b ;
    }

    public static void PrintRes(double S) {
        System.out.println("Result=" + S);
    }

}
