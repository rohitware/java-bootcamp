package encapsulation;

public class BankAccount {

    private String owner;
    private double balance;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}