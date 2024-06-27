class Student {
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }
}

public class TypesInstanceMethod {
    public static void main(String[] args) {
        System.out.println("types of instance method");
        Student student = new Student();
        student.setName("atikur rahman");
        student.setRoll(10);
        student.display();
    }
}
