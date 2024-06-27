public class PassByValue {
    public static void main(String[] args) {
        String firstAnimal = "Lion";
        String secondAnimal = "Elephant";
        System.out.println("Before swap => first : " + firstAnimal + ", second : " + secondAnimal);
        swap(firstAnimal, secondAnimal);
    }

    public static void swap(String firstAnimal, String secondAnimal) {
        String tempString = firstAnimal;
        firstAnimal = secondAnimal;
        secondAnimal = tempString;
        System.out.println("After swap  => first : " + firstAnimal + ", second : " + secondAnimal);
    }
}
