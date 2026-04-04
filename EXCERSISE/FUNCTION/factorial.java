package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        System.out.println("factorial = " + fact(n));
        sc.close();
    }
}
