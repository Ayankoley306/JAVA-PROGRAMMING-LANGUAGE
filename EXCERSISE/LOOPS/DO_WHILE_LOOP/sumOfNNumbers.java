package EXCERSISE.LOOPS.DO_WHILE_LOOP;

import java.util.*;

public class sumOfNNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Sum = " + sum);
        sc.close();
    }
}