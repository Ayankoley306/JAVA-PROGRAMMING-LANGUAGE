package EXCERSISE.BASIC;

import java.util.*;

public class swap_two_numbers {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter A number: ");
        a = sc.nextInt();
        System.out.print("Enter Second Numbre: ");
        b = sc.nextInt();
        System.out.println("Before swap a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap a = " + a + " b = " + b);
        sc.close();
    }
}
