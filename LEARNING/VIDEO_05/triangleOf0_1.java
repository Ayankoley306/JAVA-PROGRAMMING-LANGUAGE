package LEARNING.VIDEO_05;

import java.util.Scanner;

public class triangleOf0_1 {
    public static void main(String args[]) {
        /*
         * we can also done this by calculating the sum of the i and j.
         * if the sum id even the that cell will be 1 and if odd then 0.
         * 
         * for(int i = 1; i <=n; i++){
         * for(int j = 1; j <= i; j++){
         * if((i+j)%2==0){
         * System.out.print(1+" ");
         * }else{
         * System.out.print(0 +" ");
         * }
         * }
         * }
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of lines: ");
        int n = sc.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number == 1 ? 0 : 1;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
