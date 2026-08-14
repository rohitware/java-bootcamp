package interfaceinjava;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        Payment payment2 = new CardPayment();
        payment.pay();
        payment2.pay();
    }
}
