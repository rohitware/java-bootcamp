package inheritance;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brand);
        car.start();
        car.drive();
    }
}
