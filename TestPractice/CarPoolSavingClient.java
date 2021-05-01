package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarPoolSavingClient {
    @Test
    void canCalculateCostPerMile(){
        CarPoolSaving carSaving = new CarPoolSaving();
        assertEquals(5, carSaving.carCostPerMile(10,2));
    }

    @Test
    void canCalculateTotalPerDay(){
        CarPoolSaving carSaving = new CarPoolSaving();
        assertEquals(10, carSaving.totalMilePerDay(5,2));
    }
    @Test
    void calculateAverageMilePerDay(){
        CarPoolSaving carSaving = new CarPoolSaving();
        assertEquals(4,carSaving.averageMilePerDay(40,10));
    }

    @Test
    void canCalculateTotalCostPerDay(){
        CarPoolSaving carSaving = new CarPoolSaving();
        assertEquals(50, carSaving.totalCostOnDallyBasis(2,5));

    }

}
