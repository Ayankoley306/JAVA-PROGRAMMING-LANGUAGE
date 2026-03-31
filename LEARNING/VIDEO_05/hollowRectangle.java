package LEARNING.VIDEO_05;

import java.util.Scanner;

public class hollowRectangle {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nnter number of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
