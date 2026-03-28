package LEARNING.VIDEO_03;

public class conditional_statement {
    public static void main(String args[]) {
        int x = 1;
        // conditional statements are used to control the flow of the program
        // SYNTAX: IF
        if (/* Condition */true) {
            // Block of code to run if the condition is true
        }

        // SYNTAX: IF - ELSE
        if (1 == x /* Condition */) {
            // Block of code if the condition is true
            System.out.print("true");
        } else {
            System.out.print("false");
            // block of code if condition is false
        }

        // SYNTAX: IF - ELSE IF - ELSE
        if (1 == x /* Condition1 */) {
            // Block of code if the condition is true
            System.out.print("if condition 1 is true");
        } else if (2 == x/* Condition2 */) {
            System.out.print("if condotion 2 is true");
            // block of code if condition is false
        } else {
            // block of code if all condition is false;
        }

        // Switch statement
        // SYNTAX: SWITCH
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }
}
