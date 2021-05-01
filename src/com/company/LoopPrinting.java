package com.company;

public class LoopPrinting {
    public static void main(String[] args) {
        int tenth = 0;
        int hundredth = 0;
        int thousand = 0;
        int i = 0;
        System.out.printf("%2s%3s%4s", "10*N  ","100*N  ","1000*N  ");
        for (; i <=5; i++){
            tenth = 10*i;
            hundredth = 100*i;
            thousand = 1000 * i;
            System.out.printf("%2d%3d%4d%5d",i,tenth,hundredth,thousand);


        }
    }
}
