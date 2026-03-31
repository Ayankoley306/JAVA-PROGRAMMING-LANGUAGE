package LEARNING.VIDEO_06;

import java.util.Scanner;

public class hollowButterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        n *= 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j || j + i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
