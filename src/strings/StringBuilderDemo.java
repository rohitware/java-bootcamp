package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Hello");
        System.out.println("Original: " + message);

        message.append(" Java");
        System.out.println("After append: " + message);

        message.append(" World");
        System.out.println("After second append: " + message);

    }
}
