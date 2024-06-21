/* There are three types of variables in Java:
local variable
instance variable
static variable */

public class Variables {

    static int staticVar = 400; // static variable
    int instanceVar = 100; // instance variable

    public void localVarFunc() {
        int localVar = 10;
        System.out.println("local variable : " + localVar);
    }

    public static void main(String[] args) {
        System.out.println("java variables.........");
        Variables variable = new Variables();

        System.out.println("static variable : " + variable.staticVar);
        System.out.println("instance variable : " + variable.instanceVar);
        variable.localVarFunc();
    }
}
