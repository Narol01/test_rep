package practice;

import static java.lang.Math.sqrt;

public class Task {
    public static void main(String[] args) {
        // Теорема пифагора c^2 = a^2 + b^2
        double C = hypotenuse(4, 4);
        System.out.println("Hypotenuse=" + sqrt(C));
    }
    public static double hypotenuse(double a, double b){
        return (a*a) + (b*b);
    }
}
