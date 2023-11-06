package practic;

public class leapYear {
    public static void main(String[] args) {
        int y = 1600;
        int s = rest(y);
        int d = ree(y);
        int g = ret(y);
        if (s == 0 & g != 0  | g == 0 & d == 0 ){
            System.out.println(y + " год является высокосным");
        }
        else {
            System.out.println(y + " год является не высокосным");
        }
    }
    public static int rest(int y){
        return y%4;
    }
    public static int ree(int y){
        return y%400;
    }
    public static int ret(int y){
        return y%100;
    }
}
