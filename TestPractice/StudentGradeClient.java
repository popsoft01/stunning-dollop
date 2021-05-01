package TestPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeClient {
    StudentGrade grade = new StudentGrade();

    @Test
    void canCollectName(){

        grade.setName("OLu","Jecob");
        String myName = grade.getName("Olu Jecob");
        assertEquals("Olu Jecob", myName);
    }
    @Test
    void canCalculateAverage(){
        grade.setAverage(50.0);
        double avarage = grade.getAverage();
        assertEquals(50, avarage);
    }
    @Test
    void avaregeCannotBeLessThanZero(){
        grade.setAverage(-3.3);
        double avarage = grade.getAverage();
        assertEquals(0,avarage);
    }
    @Test
    void avaregeCannotBeMoreThanHundred(){
        grade.setAverage(120);
        double avarage = grade.getAverage();
        assertEquals(0,avarage);
    }
    @Test
    void avarageCanProduceGradeLetter(){
        char score = grade.getGradeLetter(90);
        assertEquals('A', score);
    }
}
