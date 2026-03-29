package EXCERSISE.LOOPS.DO_WHILE_LOOP;

import java.util.*;

public class print1ToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= n);
        sc.close();
    }
}
