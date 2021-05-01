package TestPractice;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = input.nextLine();
        System.out.println("Enter the second name");
        String lastname = input.nextLine();
        myAccount.setName(firstName,lastname);
        System.out.println(myAccount.getName());
    }
}
