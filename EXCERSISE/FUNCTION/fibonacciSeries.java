package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class fibonacciSeries {
    public static void fiboUptoNTerms(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the numbers of term: ");
        int n = sc.nextInt();
        fiboUptoNTerms(n);
        sc.close();
    }
}
