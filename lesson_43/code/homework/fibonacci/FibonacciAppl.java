package homework.fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {

        Fibonacci fibonacci= new Fibonacci(8);
        int sum=0;

        for (int s:fibonacci) {
            System.out.print(s+" ");
            sum+=s;
        }
        System.out.println();
        // 1, 1, 2, 3, 5, 8, 13, 21 - это должно получиться

        System.out.println("sum=" + sum);
        // sum = 54


    }

}