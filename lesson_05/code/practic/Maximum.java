package practic;

public class Maximum {
    public static void main(String[] args) {

        int a = -20;
        int b = -100;

        int max = maximum(a, b);
       System.out.println("Maximum " + max);


        int c = 33;

        int max2 = maximums(a, b, c);
        System.out.println("Maximum " + max2);
    }

    public static int maximum(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }

    public static int maximums(int a, int b, int c) {
        int max2 = 0;
        if (a > b && a > c) {
            max2 = a;
        }
        if(b > c && b > a) {
            max2 = b;
        }
        if(c > b && c > a) {
            max2 = c;
        }
        return max2;
    }

}
