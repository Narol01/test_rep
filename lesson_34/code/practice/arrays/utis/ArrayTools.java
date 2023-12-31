package practice.arrays.utis;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=================================");
    }

    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T finsByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void oddEvenComporator(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j],arr[j+1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void oddEvenComporatore(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (((arr[i] % 2) == 0)) {
                Integer t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Integer t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
                if (!((arr[j] % 2) == 0)) {
                    Integer t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }
        }
    }
    public static <T> void oddEvenComporatore(T[] arr,Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (comparator.compare(arr[i],arr[i+1]) == 0) {
                T t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1])>0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
                if (comparator.compare(arr[j],arr[j+1]) == 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }
        }
    }
}
