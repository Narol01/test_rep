package practic;

public class Power {
    public static void main(String[] args) {
        int count = 1;
        int res =1;
        while (count<=10){
            res = 3* res;
            System.out.println(res + " 3 in Power " + count);
            count++;
        }
    }
}
