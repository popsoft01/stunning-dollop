package com.company;

public class ArrayCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("using two operand for the calculation");
            System.exit(0);
        }
        int result = switch (args[1].charAt(0)) {
            case '+' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '-' -> Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
            case '.' -> Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
            case '/' -> Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            default -> 0;
        };
        System.out.println(args[0]+ ' '+args[1]+ ' '+ args[2]+ "=" + result);
    }
}
