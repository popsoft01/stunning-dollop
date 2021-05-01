package com.company;

import java.util.*;

public class WeatherApp {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int Number_OF_HOURS = 24;
        double [][][] data;
        data= new double[NUMBER_OF_DAYS][Number_OF_HOURS][2];

        Scanner input = new Scanner(System.in);
        for (int i =0; i< NUMBER_OF_DAYS * Number_OF_HOURS; i++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day-1][hour -1][0] = temperature;
            data[day-1][hour-1][1] =humidity;
        }

    }
}
