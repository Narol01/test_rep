package practice;

import java.util.Arrays;
import java.util.Scanner;

//Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т. д.
// Протестируйте работу метода на массиве заполненном цифрами прописью: zero, one, two, three, ..., nine
// Выполните "разворот" исходного массива.
public class reversInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array;
        int[] arra;
        int n; //Количевство элементов масива

        System.out.println("Enter the number of array elements:");
        n = scanner.nextInt();
        array = new String[n]; //Здесь уже заданое количевство элементов масива
        arra = new int[n];
        int [] mas=reversAra(arra); // масив для численых выражений
        System.out.println("Revers array:\n" + Arrays.toString(mas)+"\n");
        String [] mass=reversArr(array); //масив юля буквенных выражений
        System.out.println("Revers array:\n" + Arrays.toString(mass));
    }//конец мейна

    //начало методов
    public static int[] reversAra(int[] number){ //Метод для вывода численных выражений
        Scanner scanner=new Scanner(System.in);
        int[] mas=new int[number.length];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the element(digital) of the array at index " + i );
            number[i] =scanner.nextInt(); //задаются элементы масива до тех пор пока все места не будут заполнены
            mas[i]=number[i]; //Приравнивание заданых значений масива
        }
        // Разворот масива
        int[] array = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            array[i]=mas[mas.length-i-1];
        }
        return array;
    }
    public static String[] reversArr(String[] number) { //Метод для вывода буквенных выражений
        Scanner scanner = new Scanner(System.in);
        String[] mas = new String[number.length];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the element(letter) of the array at index " + i);
            number[i] = scanner.next(); //задаются элементы масива до тех пор пока все места не будут заполнены
            mas[i] = number[i]; //Приравнивание заданых значений масива
        }
        // Разворот масива
        String[] array = new String[mas.length];
        for (int i = 0; i < mas.length; i++) {
            array[i] = mas[mas.length - i - 1];
        }
        return array;
    }
    //конец методов
}
