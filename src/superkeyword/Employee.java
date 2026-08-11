package superkeyword;

public class Employee extends Person {
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Employee constructor called");
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
    }

}
