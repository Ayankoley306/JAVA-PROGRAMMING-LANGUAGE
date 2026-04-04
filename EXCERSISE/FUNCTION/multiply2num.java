package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class multiply2num {
    public static int mul(int x, int y) {
        return x * y;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnetr two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int mul = mul(a, b);
        System.out.println("Multiplication = " + mul);
        sc.close();
    }
}
