/*
 *  Primitive Types: Examples: Integer, Character, Boolean, and Floating Point.
    Non-primitive Types: Examples: Classes, Interfaces, and Arrays.
 */

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Data Types..........");
        System.out.println("primitive data type");
        Boolean one = false;
        System.err.println("boolean : " + one);

        byte a = 10;
        byte b = -20;
        System.err.println("byte : " + a + " | " + b);

        short s = 10000;
        short r = -5000;
        System.err.println("short : " + s + " | " + r);

        int intA = 100000;
        int intB = -200000;
        System.err.println("int : " + intA + " | " + intB);

        long longA = 100000L;
        long longB = -200000L;
        System.err.println("long : " + longA + " | " + longB);

        float f1 = 234.5f;
        double d1 = 12.3;
        System.err.println("float : " + f1 + ", double : " + d1);

        char letterA = 'A';
        System.err.println("character : " + letterA);

    }
}
