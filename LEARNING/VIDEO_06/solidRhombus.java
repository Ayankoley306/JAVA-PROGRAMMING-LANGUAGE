package LEARNING.VIDEO_06;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
