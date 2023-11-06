package practice;

public class ArrayMetods {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static int massMin(int[] minim){
        int min=minim[0];
        for (int i = 0; i < minim.length; i++) {
            if(minim[i]<min){
                min =minim[i];
            }
        }
        return min;
    }//Метод выводящий минимум из числа масива
    public static int indexMass(int[] minim) {
        int min=minim[0];
        int index=0;
        for (int i = 0; i < minim.length; i++) {
            if (minim[i] < min) {
                min =minim[i];
                index = i;
            }
        }
        return index;
    }

    //пузырьковая сортировка от меньшего к большему
    public static int[] sortArray(int[] arr){
        int min =arr[0];
        int indexMin =0;
        for (int i = 0; i < arr.length; i++) {
            indexMin=i;
            min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>min){
                min = arr[j];
                indexMin=j;
                }
            }
            //переставляем минимальный элимент в начало
            int temp=arr[i];
            arr[i]=arr[indexMin];
            arr[indexMin]=temp;
        }
        return arr;
    }
    public static void split(){
        System.out.println("------------------------------------");
    }
}
