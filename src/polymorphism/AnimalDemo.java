package polymorphism;

// all in one file
class Animal {
    public void animalSound() {
        System.out.println("Animal makes the sound");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says; bow bow");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal(); // create animal object
        Animal pig = new Pig(); // create pig object
        Animal dog = new Dog(); // create dog object

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();

    }
}
