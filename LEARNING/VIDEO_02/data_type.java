package LEARNING.VIDEO_02;

public class data_type {
    public static void main(String args[]) {
        // variables and Data type
        // There ar two types of data types in JAVA premitive and non-premitive data
        // type(in this file we only see about premitive data type)
        byte b = 100; // specifies variable with integer. Range: -128 to 127
        System.out.println("\nByte Value = " + b);
        short s = 10023; // specifies integer value the short data type is a 16-bit signed integer
                         // ranging from -32,768 to 32,767.
        System.out.println("Short Value = " + s);
        int a = 5; // int represent variables that capable of storing integer data.the int data
                   // type is a 32-bit signed integer ranging from -2,147,483,648 to 2,147,483,647.
        System.out.println("Integer Value = " + a);
        float f = 12.00f; // float represent variables that capable of storing real life number data. -3.4
                          // × 10^38 to 3.4 × 10^38
        System.out.println("Float Value = " + f);
        double d = 12.4564; // double represent variables that capable of storing floating point number
                            // data, with a range approximately from 4.9 × 10^-324 to 1.7976931348623157 ×
                            // 10^308
        System.out.println("Double Value = " + d);
        long l = 1452476; // the long data type is a 64-bit signed integer ranging from
                          // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long Value = " + l);
        char ch = 'c'; // the char data type is a 16-bit unsigned integer representing a single Unicode
                       // character, ranging from 0 to 65,535 (or '\u0000' to '\uffff')
        System.out.println("Character Value = " + ch);
        boolean bool = true; // the boolean data type holds only two values: true or false.
        System.out.println("Boolean Value = " + bool);
    }

}
