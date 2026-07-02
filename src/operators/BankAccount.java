package operators;

public class BankAccount {
    public static void main(String[] args) {
        int initialBalance = 10000;
        int deposit = 5000;
        int withdrawAmount = 2000;

        int finalBalance = (initialBalance + deposit - withdrawAmount);
        System.out.println("Final Balance: " + finalBalance);

        System.out.println("Is Final Balance Greater Than 10000: " + (finalBalance > 10000));
        
    }
}

//Check whether Final Balance > 10000
//Print the result