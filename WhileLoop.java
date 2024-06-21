public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("### while loop");
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }

        int x = 1; 
  
        // Exit when x becomes greater than 4 
        while (x <= 4) 
        { 
            System.out.println("Value of x:" + x); 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        } 
    }
}
