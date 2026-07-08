package methods.methodoverloading;

public class AdditionOverloading {
    public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        add(1, 2, 3);
        add(1, 3);
        add(3, 3.33);
    }
}
