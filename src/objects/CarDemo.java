package objects;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "BMW";
        car1.color = "White";
        car1.speed = 220;

        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);
        car1.start();

    }
}
