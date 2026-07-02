package operators;

public class ShoppingBill {
    public static void main(String[] args) {
        int mobile = 18000;
        int charger = 1200;
        int cover = 800;

        int total = mobile + charger + cover;

        System.out.println("Total bill:" + total);

        total -= 2000;
        System.out.println("After discount: " + total);
    }
}
