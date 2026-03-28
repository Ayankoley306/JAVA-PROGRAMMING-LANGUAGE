package EXCERSISE.CONDITIONAL_STATEMENT;

import java.util.*;

public class largest_of_two_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println(a + " is greater.");
        } else {
            System.out.println(b + " is greater.");
        }
        sc.close();
    }
}
