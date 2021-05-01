package com.company;

import java.util.Scanner;

public class TimeClient {
    public static void main(String[] args) {
        Time myTime = new Time();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hour");
        int newHour = input.nextInt();
        System.out.println("Enter the hour");
        int newMinute = input.nextInt();
        System.out.println("Enter the hour");
        int newSeconds = input.nextInt();
        myTime.setHour(newHour);
        myTime.setMinute(newMinute);
        myTime.setSeconds(newSeconds);
        System.out.println(myTime.toUniversalString());
        System.out.println(myTime.toString());

    }


}
