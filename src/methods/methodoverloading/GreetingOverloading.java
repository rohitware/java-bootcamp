package methods.methodoverloading;

public class GreetingOverloading {
    public static void greet() {
        System.out.println("Welcome!");
    }

    public static void greet(String name) {
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        greet();
        greet("Rohit");
    }
}
