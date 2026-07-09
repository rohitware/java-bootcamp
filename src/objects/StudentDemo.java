package objects;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Rohit";
        student1.age = 22;
        student1.city = "Pune";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.city);

        student1.study();

    }
}
