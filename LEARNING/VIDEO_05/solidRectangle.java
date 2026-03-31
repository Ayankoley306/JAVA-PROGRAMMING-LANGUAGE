package LEARNING.VIDEO_05;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the Rectangle: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
