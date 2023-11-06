package practice;

public class dopTask {
    public static void main(String[] args) {
        double get= euroDoll(650,1.07);
        System.out.println("You will get " + get + " Dollars");
        //
        double Convers= futMetr(20,0.348);
        System.out.println(Convers + " Meters ");
        //
        double day = tripDay(21,2,9,1.5);
        double price = dayPrice(99,day);
        System.out.println("The daily pass is " + Math.round(price));

    }
    public static double euroDoll(double e, double d){
        return e * d;
    }
    public static double futMetr(double e, double d){
        return e / d;
    }
    public static double tripDay(double a,double b,double c,double d){
        return  (a * b) + (c * d);

    }
    public static double dayPrice(double a,double day){
        return a / day;
    }

}
