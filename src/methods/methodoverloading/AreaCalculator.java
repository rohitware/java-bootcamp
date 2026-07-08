package methods.methodoverloading;

public class AreaCalculator {
    public static void area(int side) {
        System.out.println("Square: " + (side * side));
    }

    public static void area(int length, int width) {
        System.out.println("Rectangle: " + (length * width));
    }

    public static void area(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        area(5);
        area(10, 20);
        area(7.5);
    }
}
