package practice.wardrobe.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.wardrobe.model.Wardrobe;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {
    Wardrobe[] wardrobes;
    private static final int size = 10;
    private static final int max = 5;
    private static final int min = 1;
    static Random random = new Random();

    @BeforeEach
    void setUp() {
        wardrobes = new Wardrobe[size];
        for (int i = 0; i < wardrobes.length; i++) {
            double height = random.nextInt(min, max);
            double width = random.nextInt(min, max);
            double depth = random.nextInt(min, max);
            wardrobes[i] = new Wardrobe(height, width, depth);
        }
    }

    private void prinArray(Object[] arr, String title) {
        System.out.println("=======" + title + "========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testNaturalOlderWardrobe() {
        prinArray(wardrobes, "Test Comparable before sort");
        Arrays.sort(wardrobes);
        prinArray(wardrobes, "Test Comparable after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(0.5, 4, 1));
        System.out.println("Index=" + index);
    }

    @Test
    void areaComparator() {
        prinArray(wardrobes, "sd");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(wardrobes, comparator);
        prinArray(wardrobes, "wdwd");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1),comparator);
        System.out.println("Index=" + index);
    }

}