package practice.binary_search;

public class ArrayAppl3 {
    public static void main(String[] args) {

        int[] array = {-50, -10, 20, -100, 70, 60, 40, -10,-10, 30, 50};

        ArrayMethods3.printArray(array);// напечатать
        ArrayMethods3.bubbleSort(array);//вызвать сортировку
        ArrayMethods3.printArray(array);//напечатать
        ArrayMethods3.split();

        // вызываем binarySearch
        int index = ArrayMethods3.binarySearch(array, 20);
        System.out.println(index);
        int index2 = ArrayMethods3.binarySearch(array, 35);
        System.out.println(index2);

        int count =ArrayMethods3.searchDublicate(array,20);
        System.out.println("Such elements in the array " + count);

    }
}
