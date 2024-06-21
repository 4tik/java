public class ForLoop {
    public static void main(String[] args) {
        System.out.println("## For Loop");
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

        String array[] = { "Ron", "Harry", "Hermoine" };

        // enhanced for loop
        for (String x : array) {
            System.out.println(x);
        }

        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();// new line
        }
    }
}
