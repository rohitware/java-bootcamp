package strings;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello");
        // append
        text.append(" world");
        System.out.println("Append " + text);

        // insert
        text.insert(6, "core ");
        System.out.println("Insert: " + text);

        // replace
        text.replace(6, 11, "spring ");
        System.out.println("replace: " + text);

        // delete
        text.delete(6, 13);
        System.out.println("Delete: " + text);

        // set character
        text.setCharAt(0, 'h');
        System.out.println("Set character: " + text);

        // reverse
        text.reverse();
        System.out.println("Reverse string: " + text);

    }
}
