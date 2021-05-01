package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfEvenNumberClient {
    @Test
    void canCheckEvenNumber(){
        int evenDigit = SumOfEven.evenNumber();
        assertEquals(2, evenDigit);
    }
}
