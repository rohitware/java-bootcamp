package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int salary = 45000;
        int bonus = 5000;

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

        System.out.println("----------------------");
        System.out.println("Total salary: " + (salary + bonus));
        System.out.println("Salary after deduction: " + (salary - 200));
        System.out.println("Salary per day" + (salary / 30));
    }
}
