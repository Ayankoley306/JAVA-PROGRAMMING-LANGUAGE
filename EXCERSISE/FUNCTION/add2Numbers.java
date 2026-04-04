package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class add2Numbers {
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("sum = " + sum);
        sc.close();
    }
}
