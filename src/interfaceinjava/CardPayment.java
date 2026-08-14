package interfaceinjava;

public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using credit Card");
    }
    
}
