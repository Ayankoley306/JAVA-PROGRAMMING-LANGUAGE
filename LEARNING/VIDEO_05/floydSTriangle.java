package LEARNING.VIDEO_05;

import java.util.Scanner;

public class floydSTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of lines: ");
        int count = 1;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}