package homework;

public class Calculator {

    public int multiplication(int a, int b){
        return a*b;
    }
     public double division(double a, double b){
        int c = 0;
        if (b == 0)
        {
            return c;
        };
         return a/b;
    }
     public int addition(int a, int b){
         return a+b;
    }
     public int subtract(int a, int b){
         return a-b;
    }

}
