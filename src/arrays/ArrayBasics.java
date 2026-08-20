package arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);

        // Find the largest number in the array
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);

        // Find the smallest number in the array
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number: " + smallest);

        // Find numbers greater than 25
        System.out.println("Numbers greater than 25:");
        for (int number : numbers) {
            if (number > 25) {
                System.out.println(number);
            }
        }
        // reverse the array
        System.out.println("Reversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
