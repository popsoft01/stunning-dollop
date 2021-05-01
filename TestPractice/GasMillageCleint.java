package TestPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMillageCleint {
    GasMillage milage;
    @BeforeEach
    void DoBeforeEach(){
        milage = new GasMillage();
    }

    @Test
    void canCalculateCostOfTheTotalGas(){
        assertEquals(20,milage.toatCostOfGas(5,4));
    }
    @Test
    @DisplayName("to calculate mile per gallon")
    void canCalculatedMilePerGallon(){
        assertEquals(5,milage.gasPerMile(20,4));
    }
}
