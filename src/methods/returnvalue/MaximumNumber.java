package methods.returnvalue;

public class MaximumNumber {
    public static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        int max = findMaximum(28, 30);
        System.out.println("Maximum " + max);
    }
}
