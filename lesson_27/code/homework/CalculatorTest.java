package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    void multiplicationTest() {
        int a=4;
        int b=0;
        assertEquals(0,calculator.multiplication(a,b));
    }

    @Test
    void divisionTest() {
        double a=0;
        double b=2;
        assertEquals(0,calculator.division(a,b));
    }

    @Test
    void additionTest() {
        int a=4;
        int b=6;
        assertEquals(10,calculator.addition(a,b));
    }

    @Test
    void subtract() {
        int a=4;
        int b=6;
        assertEquals(-2,calculator.subtract(a,b));
    }
}