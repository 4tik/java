// An operator in Java is a symbol that is used to perform operations
public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators........");
        // Arithmetic Operators
        System.out.println("## Arithmetic Operators");
        int A = 10;
        int B = 20;
        System.out.println(A + B); // Addition
        System.out.println(A - B); // Subtraction
        System.out.println(A * B); // Multiplication
        System.out.println(A / B); // Division
        System.out.println(A % B); // Modulo

        // Assignment Operators
        System.out.println("## Assignment Operators");
        int a = 10, b = 20, c;
        System.out.println(c = a); // Output =10
        System.out.println(b += a); // Output=30
        System.out.println(b -= a); // Output=20
        System.out.println(b *= a); // Output=200
        System.out.println(b /= a); // Output=2
        System.out.println(b %= a); // Output=0
        System.out.println(b ^= a); // Output=0

        // Relational Operators
        System.out.println("## Relational Operators");
        System.out.println(a == b); // returns false because 10 is not equal to 20
        System.out.println(a != b); // returns true because 10 is not equal to 20
        System.out.println(a > b); // returns false
        System.out.println(a < b); // returns true
        System.out.println(a >= b); // returns false
        System.out.println(a <= b); // returns true

        // Logical Operators
        System.out.println("## Logical Operators");
        System.out.println(a < 10 & a < 20); // returns false
        System.out.println(a < 10 || a < 20); // returns true
        System.out.println(!(a < 10 & a < 20)); // returns true

        // Bitwise Operators
        System.out.println("## Bitwise Operators");
        a = 58; // 111010
        b = 13; // 001101
        System.out.println(a & b); // returns 8 = 1000
        System.out.println(a | b); // 63=111111
        System.out.println(a ^ b); // 55=11011
        System.out.println(~a); // -59

    }
}
