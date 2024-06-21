public class Condition {
    public static void main(String[] args) {
        System.out.println("Condition.........");
        int x = 10, y = 12;
        if (x + y > 20) {
            System.out.println("x + y is greater than 20");
        } else {
            System.out.println("x + y is greater than 20");
        }

        System.out.println("######## if-else-if");

        String city = "Delhi";
        if (city == "Meerut") {
            System.out.println("city is meerut");
        } else if (city == "Noida") {
            System.out.println("city is noida");
        } else if (city == "Agra") {
            System.out.println("city is agra");
        } else {
            System.out.println(city);
        }

        System.out.println("## Leap Year Example:");

        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }

        System.out.println("Using Ternary Operator");
        int number = 13;
        // Using ternary operator
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);

    }
}
