package methods.parameterized;

public class Addition {
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Sum " + result);
    }

    public static void main(String[] args) {
        add(2, 5);
        add(4, 6);
        add(100, 200);

    }
}
