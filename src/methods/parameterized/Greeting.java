package methods.parameterized;

public class Greeting {
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet("Rohit");
        greet("Pranav");
        greet("Amar");
    }
}
