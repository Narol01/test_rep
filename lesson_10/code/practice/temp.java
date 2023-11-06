package practice;


public class temp {
    public static void main(String[] args) {
        int[] tempera = new int[]{12,12,15,16,14,19,17};
        System.out.print("Temperature in tuesday ");
        System.out.println(tempera[1]);
        System.out.print("Temperature in Thursday ");
        System.out.println(tempera[3]);
        int s=0;
        for (int i = 0; i < tempera.length; i++) {
            s+=tempera[i];
        }
        System.out.println(s/ tempera.length);
    }
}
