package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    CreditLimitCalculator credit = new CreditLimitCalculator();

    @Test
    void canculateLiabilty(){
        assertEquals(50,credit.liabilty(10,20,20));
    }
    @Test
    void canCalculateTotalAsset(){
        assertEquals(50, credit.totalCredit(30,20));
    }
    @Test
    void canCalculateNewBalance(){
        assertEquals(40, credit.displayNewBalance(0,50,10));
    }
    @Test
    void canCalculateCreditLimit(){
        assertEquals(4, credit.newCreditLimit(40));
    }
    @Test
    void canDertermineCreditLimit(){
//        assertTr
    }

}