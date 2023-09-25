package week3.vince;

public class StudentTest {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student("Alice", 20);

        // Access and print the student's information
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
    }
}
