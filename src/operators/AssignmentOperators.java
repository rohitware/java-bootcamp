package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int wallet = 1000;
        System.out.println("Initial Wallet: " + wallet);

        wallet += 500;
        System.out.println("After adding 500: " + wallet);

        wallet -= 300;
        System.out.println("After shopping: " + wallet);

        wallet *= 2;
        System.out.println("Money Double: " + wallet);

        wallet /= 4;
        System.out.println("After distribution: " + wallet);

        wallet %= 7;
        System.out.println("Remaining balance: " + wallet);
    }
}
