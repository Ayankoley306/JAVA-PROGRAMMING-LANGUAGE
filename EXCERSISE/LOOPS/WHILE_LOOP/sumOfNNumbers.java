package EXCERSISE.LOOPS.WHILE_LOOP;

import java.util.*;

public class sumOfNNumbers {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}