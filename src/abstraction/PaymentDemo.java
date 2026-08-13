package abstraction;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();

        Payment payment2 = new CardPayment();
        payment.pay(1000.0);
        payment2.pay(1000.0);
    }
}
