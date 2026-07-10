package constructors;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Rohit", 22, "Pune");
        Person person2 = new Person("Aniket", 21, "Pune");

        person1.display();
        person2.display();

    }
}
