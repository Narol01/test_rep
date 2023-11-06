package practice;

public class Coin {
    public static void main(String[] args) {

        int[] coin = new int[100];
        int a = 0;
        int b = 1;

        for (int i = 0; i < coin.length; i++) {
            coin[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(coin);

        int avers = 0;
        int revers = 0;
        for (int i = 0; i < coin.length; i++) {
            if(coin[i] ==0){
                avers++;
            }
            else {revers++;}
        }
        System.out.println("Avers: " + avers + " " + (double)avers/100);
        System.out.println("Avers: " + revers + " " + (double)revers/100);

    }
    ///////////--methods-//////////
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
