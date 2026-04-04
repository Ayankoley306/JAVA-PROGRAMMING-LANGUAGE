package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class avgOf3Num {
    public static float average(float a, float b, float c) {
        return (a + b + c) / 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        float avg = average(a, b, c);
        System.out.println("Average of 3 numbers = " + avg);
        sc.close();
    }
}
