package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbTest {

    PrimeNumb primeNumb;

    @BeforeEach
    void setUp() {
        primeNumb = new PrimeNumb();
    }

    @Test
    void setPrime() {
        int a = 7;
        assertEquals(true,primeNumb.prime(a));
    }
}