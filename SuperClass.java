/**
 * InnerSuperClass
 */
class MyCollege {
    public void collegeRecord() {
        System.out.println("The college is good with a good placement record");
    }
}

/**
 * InnerSuperClass
 */
class MyStudent extends MyCollege {
    public void collegeRecord() {
        super.collegeRecord();
        System.out.println("child class");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        System.out.println("Constructors in Superclasses");

        MyCollege myCollege = new MyCollege();
        myCollege.collegeRecord();

        MyStudent myStudent = new MyStudent();
        myStudent.collegeRecord();
    }
}
