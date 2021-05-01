package com.company;

public class findingMaxValueInArrray {
    public static void main(String[] args) {
        int[] value = {20,30,40, 50, 70, 90,76,10,21};
        int max = value[0];
        for (int j : value) {
            if (j > max) {
                max = j;

            }
        }
        System.out.println("maximum value is : " + max);

    }

}
