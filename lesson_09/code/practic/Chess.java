package practic;

public class Chess {
    public static void main(String[] args) {

        int n=0;
        int m=0;
        int s=0;
        while (s <=3) {
            while (n <= 3) {

                System.out.print("0| 1| ");
                n++;
            }
        System.out.println("");
            while (m <= 3) {
                System.out.print("1| 0| ");
                m++;
            }
        System.out.println("");
        s++;
        n=0;
        m=0;
        }

    }
}

