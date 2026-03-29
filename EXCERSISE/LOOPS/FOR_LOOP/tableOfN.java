package EXCERSISE.LOOPS.FOR_LOOP;

import java.util.Scanner;

public class tableOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbe: ");
        int n = sc.nextInt();
        System.out.println("-:TABLE:-");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
