package operators;

public class EmployeeSalary {
    public static void main(String[] args) {
        double basicSalary = 50000;
        double hra = 1200;
        double bonus = 5000;

        double grossSalary = basicSalary + hra + bonus;
        System.out.println("Gross Salary : " + grossSalary);
    }
}
