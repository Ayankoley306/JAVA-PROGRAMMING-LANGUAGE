package LEARNING.VIDEO_02;

import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        sc.nextLine();
        String fullName = sc.nextLine();
        System.out.println(fullName);
        sc.close();
    }
}
