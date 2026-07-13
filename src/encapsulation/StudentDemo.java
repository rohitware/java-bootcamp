package encapsulation;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Rohit");
        student1.setAge(22);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());

    }
}
