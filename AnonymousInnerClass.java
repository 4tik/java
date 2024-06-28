/**
 * InnerAnonymousInnerClass
 */
abstract class Animal {
    abstract void dog();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        System.out.println("Anonymous Inner Class");
        Animal animal = new Animal() {
            void dog() {
                System.out.println("Dog is Animal");
            }
        };

        animal.dog();
    }
}
