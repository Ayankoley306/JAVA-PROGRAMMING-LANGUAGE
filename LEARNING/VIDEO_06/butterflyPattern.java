package LEARNING.VIDEO_06;

import java.util.*;

public class butterflyPattern {
    public static void main(String argc[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int s = 0; s < (n - i - 1) * 2; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("* ");
            }
            for (int s = 0; s < i * 2; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
