package TestPractice;

public class StudentGrade {
    private String name;
    private double grade;

    public void setName(String firstName, String lastName) {
        String name = firstName + " "+ lastName;
        this.name = name;
    }


    public String getName(String name) {
        return name;
    }

    public void setAverage(double studentAverage) {
        if (studentAverage > 0)
            if (studentAverage <= 100)
                this.grade = studentAverage;
    }

    public double getAverage() {
        return grade;
    }

    public char getGradeLetter(double gradeScore) {
        if (gradeScore < 0 || gradeScore <= 100){
            if (gradeScore >= 90)
                return 'A';
            else if (gradeScore >= 80)
                return 'B';
            else if (gradeScore >= 70)
                return 'C';
            else if (gradeScore >= 60)
                return 'D';
            else if (gradeScore >= 50)
                return 'E';
            else
                return 'F';
        }
        return '0';
    }

}
