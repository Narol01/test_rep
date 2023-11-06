package homework;

public class BubbleSorty {

    public static void BubblSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[i]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int[] sort(int[] array){
        int min= array[0];
        int indexMin=0;
        for (int i = 0; i < array.length; i++) {
            indexMin=i;
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if(array[j]>min){
                   min=array[j];
                   indexMin=j;
                }
            }
            int temp=array[i];
            array[i]=array[indexMin];
            array[indexMin]=temp;
        }
        return array;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
