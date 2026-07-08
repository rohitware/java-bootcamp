package methods.parameterized;

public class Student {
    public static void studentInfo(String name, int age) {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

    public static void main(String[] args) {
        studentInfo("Rohit", 33);
        studentInfo("Amar", 22);
        studentInfo("Krishna", 3);
    }
}
