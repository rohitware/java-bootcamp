package arrays;

public class StudentArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Rohit", 33);
        students[1] = new Student("Amit", 25);
        students[2] = new Student("Priya", 28);

        for (Student student : students) {
            student.display();
        }
    }
}
