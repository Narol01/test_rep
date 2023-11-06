package practic;

public class HomeWork {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 4;
        int ia = ifa(b,c);
        int ib = ifb(a,c);
        int is = ifc(a,b);

        if (a < ia & b< ib & c < is) {
            System.out.println("Cуществует треугольник");
        }

        else{
            System.out.println("Такого треугольника не существует");
        }
    }
    public static int ifa(int b,int c){
        return b+c;
    }
    public static int ifb(int a,int c){
        return a+c;
    }
    public static int ifc(int a,int b){
        return a+b;
    }

}
