public class MyFirst {
    public static void main(String[] args) {
        MyFirst obj = new MyFirst(n);
    }

    static int a = 10;
    static int n;
    int b = 5;
    int c;

    public MyFirst(int m) {
        System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
    }

    // Instance Block
    // whenever an object is created, and they are invoked before the constructors
    {
        System.out.println("Instance Block");
        b = 30;
        n = 20;
    }
    // Static Block(whenever the class is loaded by JVM.)
    static {
        System.out.println("Static Block");
        a = 60;
    }
}