package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class greatestCommonDevider {
    public static int gcd(int a, int b) {
        int GCD = 0;
        for (int i = 1; i <= (a < b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt(), GCD;
        GCD = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + GCD);
        sc.close();
    }
}
