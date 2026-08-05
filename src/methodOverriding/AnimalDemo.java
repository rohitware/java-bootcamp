package methodOverriding;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Animal animal = new Animal();
        animal.sound();

        Animal animal1 = new Dog();
        animal1.sound();
    }
}
