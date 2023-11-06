package practic;

public class product {
    public static void main(String[] args) {
        double A = 12.5;
        double a = Diskounta(A,10);
        double B = 7.5;
        double b = Diskountb(B,15);
        int N = 3;
        int M = 4;
        double S = sume(A,B,a,b,N,M);
        if (S > 100){
            System.out.println("C вас " + (S - res(S,5) ));
        }
        else {
            System.out.println("C вас " + S );

        }
    }
    public static double sume(double A,double B,double a,double b,int N,int M){
        return (A-a) * N + (B-b) * M;
    }
    public static double Diskounta(double A,double d){
        return (A*d)/100;
    }
    public static double Diskountb(double B,double d){
        return (B*d)/100;
        }
    public static double res (double s,double d){
        return (s*d)/100;
    }
    }
