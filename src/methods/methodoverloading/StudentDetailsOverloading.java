package methods.methodoverloading;

public class StudentDetailsOverloading {
    public static void student(String name) {
        System.out.println("Name: " + name);
    }

    public static void student(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void student(String name, int age, String city) {
        System.out.println("name = " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        student("Rohit");
        student("Rohit", 33);
        student("Rohit", 33, "Pune");
    }
}
