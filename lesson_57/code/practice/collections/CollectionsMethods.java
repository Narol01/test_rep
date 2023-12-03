package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {

        // Создайте список известных вам фруктов.
        // Выполните поиск имеющегося и отсутствующего элемента списка.
        // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
        // Проверьте работу методов
        // max(Collection<?> coll)
        // min(Collection<?> coll), что они возвращают?

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("plum");
        fruits.add("strawberry");

        System.out.println("------------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        Collections.sort(fruits);

        System.out.println("------------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        String key = "banana";
        int index = Collections.binarySearch(fruits, "banana");
        System.out.println("Index = "+index + " of " + key);
        //ищем отсутствующий элемент
        key = "kiwi";
        index = Collections.binarySearch(fruits, "bananas");
        System.out.println("Index = "+index + " of " + key);

        Comparator<String> fComparator =new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };
        Collections.sort(fruits,fComparator);

        System.out.println("------------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        String max =Collections.max(fruits);
        String min =Collections.min(fruits);
        System.out.println("------------------------");
            System.out.println("Max of= "+max);
            System.out.println("Min of= "+min);
        System.out.println("-------------------------");

        Collections.reverse(fruits);
        System.out.println("------------------------");
        for (String s : fruits) {
            System.out.println(s);
        }
        max =Collections.max(fruits);
        min =Collections.min(fruits);
        System.out.println("Max of= "+max);
        System.out.println("Min of= "+min);
        System.out.println("-------------------------");


    }
}
