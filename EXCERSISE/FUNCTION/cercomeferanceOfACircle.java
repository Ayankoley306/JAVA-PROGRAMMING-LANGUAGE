package EXCERSISE.FUNCTION;

import java.util.Scanner;

public class cercomeferanceOfACircle {
    public static float crecomeferance(int r) {
        return 2 * r * 3.14f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Radius of a circle: ");
        int r = sc.nextInt();
        float cer = crecomeferance(r);
        System.out.println("Cercomeferance of the circle is : " + cer);
        sc.close();
        return;
    }
}
