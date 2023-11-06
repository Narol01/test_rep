package practice.arrays.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.arrays.utis.ArrayTools;

import java.util.Arrays;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrnum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrnum = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        arrStr = new String[]{"one", "two", "four", "three"};
    }

    @Test
    void printArray() {
        System.out.println("============testPrintArray=============");
        ArrayTools.printArray(arrnum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("=========testSearch=========");
        int index = ArrayTools.search(arrnum, "4");
        System.out.println("index= " + index);
        index = ArrayTools.search(arrnum, 6);
        System.out.println("index= " + index);
        index = ArrayTools.search(arrStr, "four");
        System.out.println("index= " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index= " + index);
    }

    @Test
    void testfindByPredicarte() {
        System.out.println("============testFindByPredicarte===========");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String a = "f";
                int b = a.charAt(0);
                if (s.charAt(0) == b) {
                    return true;
                }
                return false;
            }
        };
        String num = ArrayTools.finsByPredicate(arrStr, predicate);
        System.out.println(num);
        String str = ArrayTools.finsByPredicate(arrStr, s -> s.length() == 3);
        System.out.println(str);
        Predicate<Integer> predicate1 = n -> n < 5;
        Integer num1 = ArrayTools.finsByPredicate(arrnum, predicate1);
        System.out.println(num1);
        Integer num2 = ArrayTools.finsByPredicate(arrnum, n -> n % 5 == 0);
        System.out.println(num2);
    }

    @Test
    void testBubbleSort() {
        System.out.println("===========BubbleSort============");
        ArrayTools.bubbleSort(arrnum);
        ArrayTools.printArray(arrnum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortComporator() {
        System.out.println("===========BubbleSort============");
        ArrayTools.bubbleSort(arrnum, (n1, n2) -> n2 - n1);
        ArrayTools.printArray(arrnum);
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testOddEvenComporator() {
        System.out.println("===========BubbleSort============");
        Arrays.sort(arrnum,(n1,n2)->{
            if(n1%2==0 && n2%2 !=0){
                return -1;
            }
             if(n1%2!=0 && n2%2 ==0){
                return 1;
            }
            if(n1%2==0 && n2%2 ==0){
                return n1-n2;
            }
            if(n1%2!=0 && n2%2 !=0){
                return n2-n1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(arrnum));
    }
}