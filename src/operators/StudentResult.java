package operators;

public class StudentResult {
    public static void main(String[] args) {
        int maths = 75;
        int science = 80;
        int english = 90;

        int total = maths + science + english;

        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
