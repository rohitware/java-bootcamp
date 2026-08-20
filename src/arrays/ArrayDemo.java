package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Enhanced for Loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
