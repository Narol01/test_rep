package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods=new ArrayMethods();
    }

    @Test
    void sumElement() {
        int[] array ={1,2,3,4,5,6,7,8,9,9};
        System.out.println(Arrays.toString(array));
        assertEquals(54,arrayMethods.SumElement(array));
    }

    @Test
    void sortArray() {
        int[] array1 ={1,2,3,4,5,6,7,8,9,10};
        int[] array2 ={6,2,4,3,5,1,10,8,9,7};
        System.out.println(Arrays.toString(array2));
        assertArrayEquals(array1,arrayMethods.sortArray(array2));
    }

    @Test
    void countPozitiv() {
        Random random=new Random();
        int[] arrayCoun1=new int[100];
        for (int i = 0; i < arrayCoun1.length; i++) {
            arrayCoun1[i]=random.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(arrayCoun1));
        int n =arrayMethods.countPozitiv(arrayCoun1);
        assertEquals(n,arrayMethods.countPozitiv(arrayCoun1));
    }

    @Test
    void countNegativ() {
        Random random=new Random();
        int[] arrayCoun1=new int[100];
        for (int i = 0; i < arrayCoun1.length; i++) {
            arrayCoun1[i]=random.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(arrayCoun1));
        int m= arrayMethods.countNegativ(arrayCoun1);
        assertEquals(m,arrayMethods.countNegativ(arrayCoun1));
    }

    @Test
    void countPar() {
        Random random=new Random();
        int[] arrayCoun1=new int[100];
        for (int i = 0; i < arrayCoun1.length; i++) {
            arrayCoun1[i]=random.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(arrayCoun1));
        int v=arrayMethods.countPar(arrayCoun1);
        assertEquals(v,arrayMethods.countPar(arrayCoun1));
    }

    @Test
    void countNull() {
        Random random=new Random();
        int[] arrayCoun1=new int[100];
        for (int i = 0; i < arrayCoun1.length; i++) {
            arrayCoun1[i]=random.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(arrayCoun1));
        int c = arrayMethods.countNull(arrayCoun1);
        assertEquals(c,arrayMethods.countNull(arrayCoun1));
    }
}