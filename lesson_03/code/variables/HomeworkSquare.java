package variables;

public class HomeworkSquare {
    public static void main(String[] args) {
        //  a = side();
        double S = areaSquad(24);
        //PrintSide(a);
        PrintRes(S);

    }
    //public static void  PrintSide(double a){
        //System.out.println("Area=" + a);

    public static void PrintRes(double S){
        System.out.println("Result=" + S);
    }
    public static double areaSquad(double a){
        return a*a;
    }
   // public static double side(){
       // double a = 24;
       //  return a;

}
