package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee employee = new Developer(); // create a developer object
        Employee employee1 = new Manager();  // create a manager object

        Employee employee2 = new Employee();  // create a employee object


        employee.work();
        employee1.work();

        employee2.work();
    }
}
