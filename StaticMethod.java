// method that has static keyword is known as static method

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Static Method");
        staticShow();
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.show();
    }
    // advantage of a static method is that we can call it without creating an
    // object

    static void staticShow() {
        System.out.println("method that has static keyword is known as static method");
    }

    void show() {
        System.out.println("this is non-static methods");
    }

}
