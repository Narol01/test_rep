package homework;

import java.util.*;

public class Set2 {
    public static void main(String[] args) {
        Random random=new Random();

        Integer[] list1 = new Integer[10];
        Integer[] list2 = new Integer[10];

        for (int i = 0; i < list1.length; i++) {list1[i]=random.nextInt(1,10);}
        for (int i = 0; i < list2.length; i++){list2[i]=random.nextInt(1,10);}

        Set<Integer> set1 = new HashSet<>(List.of(list1));
        Set<Integer> set2 = new HashSet<>(List.of(list2));
//        for (int i = 0; i < list1.length; i++){set1.add(list1[i]);}
//        for (int i = 0; i < list2.length; i++){set2.add(list2[i]);}

        System.out.println(set1);
        System.out.println(set2);

        set1.retainAll(set2);// Определяем пересечение множеств

        System.out.println("Unique elements contained in both lists:");
        for (int element : set1) {
            System.out.print(element+",");
        }
        System.out.println();

        // Выводим количество уникальных элементов
        System.out.println("Unique elements contained in both lists: " + set1.size());
    }
}
