package variables;

public class VariablesDemo1 {
    public static void main(String[] args){
        // Declaring variables with explicit types
        String name = "Rohit";
        int age = 23;
        double price = 99.000;
        boolean isJavaFun = true;
        char grade = 'A';

        // Printing them
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Grade: " + grade);

        // Widening cast: int -> double (automatic, no data loss)
        double ageAsDouble = age;
        System.out.println("Age as double: " + ageAsDouble);

        // Narrowing cast: double -> int (manual, loses decimal part)
        int priceAsInt = (int) price;
        System.out.println("Price as int: " + priceAsInt);
    }
}
