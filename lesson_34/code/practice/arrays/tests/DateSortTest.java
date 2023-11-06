package practice.arrays.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            String[] date = s1.split("-");
            int f = Integer.parseInt(date[2]);
            int q = Integer.parseInt(date[1]);
            int e = Integer.parseInt(date[0]);
            String[] c = s2.split("-");
            int a = Integer.parseInt(c[2]);
            int w = Integer.parseInt(c[1]);
            int r = Integer.parseInt(c[0]);
            int res=f-a;
            int res1=q-w;
            return  res !=0 ? res : res1 !=0 ? res1 : e-r;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        System.out.println(Arrays.toString(dates));
        assertArrayEquals(expected, dates);
    }
}