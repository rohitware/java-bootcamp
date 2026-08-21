package strings;

public class StringSearchDemo {
    public static void main(String[] args) {
        String sentence = "Java is easy to learn";

        // Check whether Java exists
        boolean hasJava = sentence.contains("Java");
        System.out.println("Contains Java: " + hasJava);

        // find the position of java
        int javaIndex = sentence.indexOf("Java");
        System.out.println("Index of Java is: " + javaIndex);

        // Find position of easy
        int positionOfEasy = sentence.indexOf("easy");
        System.out.println("Position of easy is : " + positionOfEasy);

        // Check beginning
        System.out.println("Start with java: " + sentence.startsWith("Java"));

        // check end
        System.out.println("End with learn: " + sentence.endsWith("learn"));
    }
}
