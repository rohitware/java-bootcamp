package methods.returnvalue;

public class SalaryCalculator {
    public static int calculateSalary(int basic, int bonus) {
        return basic + bonus;
    }

    public static void main(String[] args) {
        int salary = calculateSalary(50000, 2000);
        System.out.println("Total salary is: " + salary);
    }
}
