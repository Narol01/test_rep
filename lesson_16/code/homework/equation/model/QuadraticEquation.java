package homework.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display(){
        System.out.println("a= "+a+"\nb= "+b+"\nc= "+c);

    }

    public double delta(){
        return (b*b)-4*a*c;
    }

    public static void split(){
        System.out.println("-------------------------------");
    }

    public int quantityRoots(double dis){
        int v=0;
        if(dis>0){
            v=2;
            return v;
        }
        if (dis==0){
            v=1;
            return v;
        }
        if(dis<0){
            v=0;
            return v;
        }
        return v;
    }
}
