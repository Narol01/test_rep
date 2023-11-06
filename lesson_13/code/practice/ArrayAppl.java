package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayAppl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        System.out.println("Enter the numbers of element in the array");//Задать число элементов масива
        int n= scanner.nextInt();
        int[] numbers=new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1,37);}//Определить элементы масива
        ArrayMetods.printArray(numbers);
        int index=ArrayMetods.indexMass(numbers);//индекс минимального числа НЕотсортированого масива
        ArrayMetods.sortArray(numbers);
        ArrayMetods.printArray(numbers);
        int max =ArrayMetods.massMin(numbers);//Значение инимального числа
        int indexSort=ArrayMetods.indexMass(numbers);//индекс минимального числа НЕотсортированого масива
        //Вывод данных на экран пользователю
        System.out.println("Min = " + max);
        System.out.println("Min index = " + index);
        System.out.println("Min index of Sort = " + indexSort);

        ArrayMetods.split();//Разделительная черта, далее всё идентично но для другого случайно сгенерированого масива

        int[] number2=new int[n];
        for (int i = 0; i < number2.length; i++) {
            number2[i] = random.nextInt(1,37);}
        ArrayMetods.printArray(number2);
        int indexSort2=ArrayMetods.indexMass(number2);
        ArrayMetods.sortArray(number2);
        ArrayMetods.printArray(number2);
        int max2=ArrayMetods.massMin(number2);
        int index2=ArrayMetods.indexMass(number2);
        System.out.println("Min = " + max2);
        System.out.println("Min index = " + indexSort2);
        System.out.println("Min index of Sort = " + index2);

//        String[] digits={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        ArrayMetods.printArray(digits);

    }
}
