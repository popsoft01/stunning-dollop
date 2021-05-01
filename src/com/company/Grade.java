package com.company;

import java.util.Scanner;

class Grade{
    public char gradeCalculator(int score){
        if (score > 70)
            return 'A';
        else if (score > 60)
            return 'B';
        else  if (score > 50)
            return 'C';
        else if (score > 40)
            return 'D';
        else
            return 'F';
    }
    public double scoreAverage(double score){
        double totalScore = score + score;
      double average = totalScore/15;
      return  average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Enter the student Score");
        int counter = 0;
        while (counter <= 15){
            int scoreInput = input.nextInt();
            System.out.println(grade.gradeCalculator(scoreInput));
            System.out.println("Enter the student Score");
        }
        counter++;
    }

}