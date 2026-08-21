package strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Rohit Ware";

        // print the string
        System.out.println("Name:" + name);

        // 2. Find length
        System.out.println("Leangth of string is: " + name.length());

        // 3. Get first character
        System.out.println("First character is: " + name.charAt(0));

        // 4. Get last character
        System.out.println("Last character is: " + name.charAt(name.length() - 1));

        // 5. Convert to uppercase
        System.out.println("Uppercase:" + name.toUpperCase());

        // 6 Convert to lower
        System.out.println("To lowercase:" + name.toLowerCase());

        // 7. Check whether String contains something
        System.out.println("Contains Ware:" + name.contains("Ware"));

        // 8. Find index of a character
        System.out.println("Index of character W is: " + name.indexOf("W"));

        // 9. Check starting text
        System.out.println("Starting text is: " + name.startsWith("Rohit"));

        // 10 check ending text
        System.out.println("Ending text is:" + name.endsWith("Ware"));

        // 11. Extract Rohit
        System.out.println("First name: " + name.substring(0, 5));

        // 12. Extract Ware
        System.out.println("Last name: " + name.substring(6));
    }
}
