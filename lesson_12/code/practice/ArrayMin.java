package practice;

import java.util.Arrays;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//        Найдите минимальный элемент массива и его индекс.
//        Напечатайте все элементы массива с НЕчетными индексами.
//        Найдите произведение всех четных элементов массива.
public class ArrayMin {
    public static void main(String[] args) {
        int[] massiv= {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};
        int minArr=massMin(massiv);
        int index= indexMass(massiv);
        int[] oddVoid= oddInMass(massiv);
        int[] evenVoid= evenInMass(massiv);
        int even = evenNumbers(massiv);
        System.out.println("odd array:\n" + Arrays.toString(massiv));
        System.out.println("Min numbers of array:"+ minArr);
        System.out.println("Index of min numbers:" + index+"\n");
        System.out.println("odd array:\n" + Arrays.toString(oddVoid)+"\n");
        System.out.println("even array:\n" + Arrays.toString(evenVoid));
        System.out.println("Production only even numbers:" + even);

    }
//    начало методов
    public static int massMin(int[] minim){
        int min= minim[0];
        for (int i = 0; i < minim.length; i++) {
            if(minim[i]<min){
                min =minim[i];
            }
        }
        return min;
    }//Метод выводящий минимум из числа масива
    public static int indexMass(int[] minim){
        int min= minim[0];
        int index=0;
        for (int i = 0; i < minim.length; i++) {
            if(minim[i]<min){
                min= minim[i];
                index = i;
            }
        }
        return index;
    }//Метод выводящий индекс минимального числа из масива
    public static int[] oddInMass(int[] odd){
        int[] oddInMass=new int[odd.length];
        for (int i = 0; i < odd.length; i++) {
            if(i%2!=0){
                oddInMass[i]=odd[i];
            }
        }
        return oddInMass;
    }//Нечетные числа
     public static int[] evenInMass(int[] even){
        int[] evenInMass=new int[even.length];
        for (int i = 0; i < even.length; i++) {
            if(even[i]%2==0){
                evenInMass[i]=even[i];
            }
        }
        return evenInMass;
    }//Четные числа

    public static int evenNumbers(int[] even){
        int proiz=1;
    for (int i = 0; i < even.length; i++) {
        if(even[i]%2 == 0){
            proiz*=even[i];
        }
    }
    return proiz;
}//Производная всех четных чисел

//    конец методов

}
