package com.company;
import java.security.SecureRandom;

public class SecureNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        for (int i = 1; i <= 20; i++){
            int number = 1 + random.nextInt(6);
            System.out.printf("%d    ", number);

            if (i % 5 == 0)
                System.out.println();

        }
    }
}
