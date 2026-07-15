package encapsulation;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setOwner("Rohit");
        account.deposit(5000);
        account.deposit(3000);
        account.withdraw(2000);
        account.withdraw(9000);

        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance());
    }
}
