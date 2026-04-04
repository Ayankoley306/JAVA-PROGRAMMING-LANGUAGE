package LEARNING.VIDEO_07;

import java.util.Scanner;

public class function {
    /*
     * functoins are used to perform a single task or a feature
     * SYNTAX:
     * public static return_type function_name ( data_type arg1, data_type arg2,
     * .......){
     * ! block of code to execute
     * }
     */

    // Example
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String args[]) {
        System.out.println("\nEnter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }
}