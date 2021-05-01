package com.company;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of item: ");
        int numberOfArray = input.nextInt();
        int[] number = new int[numberOfArray];
        int sum = 0;


        for (int i = 0; i< numberOfArray; i++){
            number[i] = input.nextInt();
            sum += number[numberOfArray-1];
        }
        int average = sum /numberOfArray;
        int count = 0;
        for(int i = 0; i<numberOfArray; i++){
            if (number[i]>average)
                count++;

            System.out.println("Number of elements above the avarage is " + count);
        }
        System.out.println("Average is "+ average);
    }
}
