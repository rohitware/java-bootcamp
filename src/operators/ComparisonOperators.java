package operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        int javaMarks = 75;
        int passingMarks = 35;

        System.out.println("Java Marks: " + javaMarks);
        System.out.println("Passing Marks: " + passingMarks);

        System.out.println("Equal: " + (javaMarks == passingMarks));
        System.out.println("Not Equal: " + (javaMarks != passingMarks));
        System.out.println("Greater Than: " + (javaMarks > passingMarks));
        System.out.println("Less Than: " + (javaMarks < passingMarks));
        System.out.println("Greater Than or Equal: " + (javaMarks >= passingMarks));
        System.out.println("Less Than or Equal: " + (javaMarks <= passingMarks));

    }
}
