package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class maxOfTwoNum {
    public static int average(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int max = average(a, b);
        System.out.println("Greatest of 2 numbers = " + max);
        sc.close();
    }
}
