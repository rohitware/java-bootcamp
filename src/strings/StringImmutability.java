package strings;

public class StringImmutability {
    public static void main(String[] args) {
        String name = "Rohit";
        System.out.println("Before: " + name);

        name.concat("Ware");
        System.out.println("After concat without assignment: " + name);

        name = name.concat(" Ware");
        System.out.println("After concat without assignment: " + name);
    }
}
