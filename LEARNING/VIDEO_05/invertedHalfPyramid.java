package LEARNING.VIDEO_05;

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        sc.close();
    }
}
