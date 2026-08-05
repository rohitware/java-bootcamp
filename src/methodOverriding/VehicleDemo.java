package methodOverriding;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Bike bike = new Bike();
        bike.start();

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Vehicle vehicle1 = new Car();
        vehicle1.start();

        Vehicle vehicle2 = new Bike();
        vehicle2.start();
    }
}
