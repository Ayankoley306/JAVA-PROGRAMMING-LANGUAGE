package EXCERSISE.CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class age_checker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an Adult!");
        }
        sc.close();
    }
}
