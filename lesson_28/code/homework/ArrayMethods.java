package homework;

import java.util.Random;

public class ArrayMethods {

    int SumElement(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        return sum;
    }

    int[] sortArray(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            indexMin = i;
            min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            //переставляем минимальный элимент в начало
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
        return arr;
    }

      public static int[] array(){
        Random random=new Random();
        int[] arrayCoun1=new int[100];
        for (int i = 0; i < arrayCoun1.length; i++) {
            arrayCoun1[i]=random.nextInt(-10,10);
        }
        return arrayCoun1;
    }
    int countPozitiv(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]<0){
                count++;
            }
        }
        return count;
    }

    int countNegativ(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]<0){
                count++;
            }
        }
        return count;
    }

    int countPar(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    int countNull(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]==0){
                count++;
            }
        }
        return count;
    }

}
