package practice;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        int[] randomInt = new int[10];
        Random random=new Random();
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i]=random.nextInt(-20,20);

        }
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + ", " );
        }

        boolean isInArray = searchInArray(randomInt ,num);
        if(isInArray){
            System.out.print("\nNumber " + num + " present in array");
            System.out.println();
        }
        else {
            System.out.print("\nNumber " + num + " does NOT present  in array");
            System.out.println();
        }
    }
    public static boolean searchInArray(int[] arr,int n){
        boolean res= false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                res = true;
            }
        }
        return res ;
    }
}
