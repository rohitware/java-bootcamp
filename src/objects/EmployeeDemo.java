package objects;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "Rohit";
        employee1.age = 22;
        employee1.city = "Pune";

        System.out.println(employee1.name);
        System.out.println(employee1.age);
        System.out.println(employee1.city);

        employee1.javaProgrammer();

    }
}
