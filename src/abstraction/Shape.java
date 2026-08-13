package abstraction;

public abstract class Shape {
   // abstract method - no body, child MUST implement it
   public abstract double area();
   public abstract double perimeter();

       // normal method - has body, child inherits it directly
public void display() {
    System.out.println("This is a shape.");     
   }    

}
