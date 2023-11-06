package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReTest {
    ArrayRe arrayRe;

    @BeforeEach
    void setUp() {
        arrayRe=new ArrayRe();
    }

    @Test
    void arrayArrage() {
        int[] array={-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        assertEquals(2,arrayRe.arrayArrage(array));
    }

    @Test
    void arrayArrage1() {
        int[] array={5, 17, 23, 30, 22, 18, 3, 77, 19, 2};
        assertEquals(18,arrayRe.arrayArrage(array));
    }
    @Test
    void arrayArrage2() {
        int[] array={1, 1, 1, 1, 1, 1, 1, 1, 1, 1};// результат NaN потому что число 1 не парное
        assertEquals(1,arrayRe.arrayArrage(array));
    }

    @Test
    void arrayArrage3() {
        int[] array={2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(2,arrayRe.arrayArrage(array));
    }
}