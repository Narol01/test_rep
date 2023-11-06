package practice;

public class method2 {
    public static void main(String[] args) {
        int a = 45;
        int n = divBy2(a);
        System.out.println(n);
//
        int b = 83;
        int m = divBy5(b);
        System.out.println(m);
//
        int number = 478;
        int res = sumDigits(number);
        System.out.println(res);

    }
    public static int divBy2(int a){
        return a % 2;
    }
    public static int divBy5(int b) {
        return b / 5;
    }
    public static int sumDigits(int n){
        int c1 = (n / 100)%100;
        int c2 = (n / 10)%10;
        int c3 = n % 10;
        return c1 + c2 + c3;

    }
}
