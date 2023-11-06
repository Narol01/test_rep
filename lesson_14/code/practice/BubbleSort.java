package practice;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {//правый конец движется на встречу левому
                if (arr[j]>arr[j+1]){//если левый из соседей больше правого,то меняем их местами
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
