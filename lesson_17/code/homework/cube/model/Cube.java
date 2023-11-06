package homework.cube.model;

public class Cube {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("Cube edge length= "+a);
    }
    public static void split(){
        System.out.println("-------------------------------");
    }

    public int per() {
        return 12*a;
    }

    public int area() {
        return 6*(a*a);
    }

    public int v() {
        return a*a*a;
    }

}
