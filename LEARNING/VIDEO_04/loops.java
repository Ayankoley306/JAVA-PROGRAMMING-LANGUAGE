// Loops in java
package LEARNING.VIDEO_04;

public class loops {
    // loops are used to execute a single block of code reapeatedly
    // in java there ar 3 types of LOOPS - for loop, while loop, do-while loop

    public static void main(String args[]) {
        // FOR LOOP
        /*
         * for (initilization;condition;steps){
         * // block of code to run till the condition is true
         * }
         */
        for (int count = 0; count < 5; count++) {
            System.out.println("Hello World");
        }

        // WHILE LOOP
        /*
         * initilization
         * while(condition){
         * block of code to run wile condition is true.
         * steps (increment/decrement)
         * }
         */
        int count = 0;
        while (count < 10) {
            System.out.println(count + " ");
            count++;
        }

        // DO-WHILE
        /*
         * initilization
         * do{
         * block of code to run while condition is true.
         * steps (increment/decrement)
         * }while(condition);
         */
        count = 0;
        do {
            System.out.println(count + " ");
            count++;
        } while (count <= 10);
    }
}
