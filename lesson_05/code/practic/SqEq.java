package practic;

public class SqEq {
    public static void main(String[] args) {
//        Дискриминант вычислить по формуле: d = bb - 4ac Если d > 0 ,
//        то x1 = (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a). Если d = 0,
//        то x = -b / (2a). Если d < 0, то сообщить, что корней нет.
        double a = 3;
        double b = 5;
        double c = 0;

        double d = dis(a,b,c);

        if( d < 0){
            System.out.println("There are no roots");
        }
        else if (d == 0){
            double x = -b / (2*a);
            System.out.println("One root: " + x);
        }
        else{
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Root 1: " + x1 );
            System.out.println("Root 2: " + x2 );

        }

    }
    public static double dis(double a,double b,double c){
        return b*b - 4*a*c;
    }
}
