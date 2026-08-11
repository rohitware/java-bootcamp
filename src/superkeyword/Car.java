package superkeyword;

public class Car extends Vehicle {

    String brand = "BMW";

    public void display() {

        System.out.println(brand);
        System.out.println(super.brand);
    }
}