package constructors;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW", "White");
        Car car1 = new Car("Honda", "Black");

        car.display();
        car1.display();

    }
}
