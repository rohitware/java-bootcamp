package abstraction;

public class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
                System.out.println("Payment made using UPI");

    }
    
}
