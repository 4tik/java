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

    }
}
