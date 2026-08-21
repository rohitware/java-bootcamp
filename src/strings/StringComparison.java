package strings;

public class StringComparison {
    public static void main(String[] args) {
        String name1 = "Rohit";
        String name2 = "Rohit";

        System.out.println("name1 == name2: " + (name1 == name2)); // true
        System.out.println("name1.equals(name2) : " + name1.equals(name2)); // true

        String name3 = new String("Rohit");
        String name4 = new String("Rohit");
        System.out.println("name3 == name4: " + (name3 == name4)); // false
        System.out.println("name3.equals(name4): " + name3.equals(name4)); // true

    }
}