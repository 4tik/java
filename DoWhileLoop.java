public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("## Do-while Loop");
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 10);

        int x = 21;
        do {
            // The line will be printed even
            // if the condition is false
            System.out.println("Value of x:" + x);
            x++;
        } while (x < 20);
    }
}
