package arrays;

public class StudentMarks {

    public static void main(String[] args) {
        int[] marks = { 75, 82, 68, 91, 88 };
        int total = 0;
        for (int mark : marks) {
            total = total + mark;
        }
        double average = (double) total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}