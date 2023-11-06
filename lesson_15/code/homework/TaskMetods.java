package homework;

public class TaskMetods {

    public static int[] pozitivArray(int[] array){
        int index=0;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;

            }
        }//Закончили делать щётчик положительных чисел. Знание этого числа нам нужно
        // что бы указать длину нового масива котрый будет иметь только положительные числа

        int[] pozArray =new int[count];//новый масив с длинной в количевство положительных чисел
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                pozArray[index]= array[i];
                index++;//индексы новогго мастина считаются по новом также
            }
        }
        return pozArray;
        //Здесь закончили запись нового масива,
        // имеющего только положительные числа и вернули его
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // правый конец будет двигаться к началу
                if(arr[j] > arr[j + 1]) { // если левый из соседей больше правого, то их меняем местами,
                    // бОльший элемент "всплывает" к правому концу массива
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static int binarySearch(int[] arr,int num){
        int left=0;
        int right= arr.length-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]== num) {
                return mid;}
            else if(num<arr[mid]){
                right = mid-1;
            }
            else { left=mid+1;
            }
        }
        return -left; //хотим вернуть -1 , если элемент не найден
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void split(){
        System.out.println("-------------------------------");
    }

    public static void change(int[] arr1,int[]arr2,int index ,int index2){
        int temp=arr1[index];
        arr1[index]=arr2[index2];
        arr2[index2]=temp;
    }
}
