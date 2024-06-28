public class NestedInnerClass {
    /**
     * InnerNestedInnerClass
     */
    class InnerClass {
        public void show() {
            System.out.println("In a nested class method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nested Inner Class");
        NestedInnerClass.InnerClass innerClass = new NestedInnerClass().new InnerClass();
        innerClass.show();
    }
}
