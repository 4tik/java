public class BranchingStatements {
    public static void main(String[] args) {
        System.out.println("## Branching Statements");
        // In Java, there are three Branching Statements. They are as follows:

        // Break Statement
        // Continue Statement
        // Return Statement

        System.out.println("Break statement in Java");
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");

        System.out.println("Continue Statement in Java:");
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }

        System.out.println("Return Statement in Java:");
        boolean t = true;
        System.out.println("Before the return.");

        if (t)
            return;

        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");

    }
}
