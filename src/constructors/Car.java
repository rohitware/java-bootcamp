package constructors;

public class Car {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println(("Color: " + color));
    }
}
