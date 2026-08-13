package abstraction;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        circle.display();

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        rectangle.display();
    }
}
