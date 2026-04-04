package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class sumOfOddUptoN {
    public static int sumOfOddNumbersUptoN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        int sum = sumOfOddNumbersUptoN(n);
        System.out.println("Sum of all odd numbers upto n: " + sum);
        sc.close();
        return;
    }
}
