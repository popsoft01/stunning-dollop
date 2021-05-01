package com.company;

public class SwappingOfArrayElement {
    public static void swap(int numberOne, int numberTwo){
        int temp = numberOne;
        numberOne = numberTwo;
        numberOne = temp;
    }
    public static void swapingElement(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args) {
        int[] number = {4,5};
        swap(number[0], number[1]);

        swapingElement(number);
    }
}
