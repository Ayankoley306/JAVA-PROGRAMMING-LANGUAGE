package EXCERSISE.LOOPS.WHILE_LOOP;

import java.util.Scanner;

public class tableOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the table number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("-:TABLE:-");
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
        sc.close();
    }
}
