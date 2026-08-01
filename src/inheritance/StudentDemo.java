package inheritance;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Rohit";
        student.age = 22;
        student.rollNumber = 101;

        student.display();
        System.out.println(student.rollNumber);
        student.study();

    }
}
