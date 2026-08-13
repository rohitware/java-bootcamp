package abstraction;

public abstract class Payment {
    public abstract void pay(double amount);    

       public void receipt() {
        System.out.println("Payment receipt generated");
    }
}
