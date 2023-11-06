package homework;

import java.util.Random;
import java.util.Scanner;

public class TaskAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
        int n = scanner.nextInt();
        int[] numbers = new int[n];
             for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(10, 100);
             }
        TaskMetods.bubbleSort(numbers);//сортировка
        TaskMetods.printArray(numbers);//вывод отсортированого масива случайных чисел
        int  index = TaskMetods.binarySearch(numbers,0);//поиск количевства нолей
        // и его позиция или возможная позиция в случае его отсутвия в масиве(с минусовым знаком)
        System.out.println(index);
        int[] arr=TaskMetods.pozitivArray(numbers);//масив с положительными числами
        TaskMetods.printArray(arr);//Вывод масива с положительными числами

        }
}
