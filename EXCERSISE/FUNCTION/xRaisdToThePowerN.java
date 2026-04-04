package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class xRaisdToThePowerN {
    public static int power(int x, int n) {
        int pow = 1;
        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int pow = power(x, n);
        System.out.println(x + " raisd to the power " + n + " is: " + pow);
        sc.close();
    }
}
