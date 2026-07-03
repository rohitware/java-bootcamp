package conditionals;

public class ATMWithdrawal {
    public static void main(String[] args) {
        int balance = 4999;
        int withdraw = 5000;

        if (balance >= withdraw) {
            System.out.println("Wothdraw successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}