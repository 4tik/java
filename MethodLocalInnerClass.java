public class MethodLocalInnerClass {

    static void outerMethod() {
        System.out.println("in outer method...........");
        class InnerMethodLocalInnerClass {
            public void insideClass() {
                System.out.println("method->inner class->in method");
            }
        }

        InnerMethodLocalInnerClass innerMethodLocalInnerClass = new InnerMethodLocalInnerClass();
        innerMethodLocalInnerClass.insideClass();
    }

    public static void main(String[] args) {
        System.out.println("Method Local Inner Class");
        outerMethod();
    }
}
