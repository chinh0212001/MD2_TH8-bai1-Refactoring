package rikkei.academy.test;


import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import rikkei.academy.Calculator;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculatorAdd(){
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected,result);
    }
}
