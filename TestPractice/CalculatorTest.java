package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    void calculatorHasStatus(){
        assertTrue(calculator.getStatus());
    }

    @Test
    void calculatorCanAdd(){
        int sum = calculator.add(6,5);
        assertEquals(11,sum);
    }
    @Test
    void calculatorCanSubstract(){
        int minus = calculator.subtract(6, 4);
        assertEquals(2,minus);
    }
    @Test
    void calculatorCanDivide(){
        double division = calculator.divide(8,2);
        assertEquals(4, division);

    }

}
