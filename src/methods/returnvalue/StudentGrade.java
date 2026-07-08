package methods.returnvalue;

public class StudentGrade {
    public static String getGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";

    }

    public static void main(String[] args) {
        String grade = getGrade(87);
        System.out.println(grade);
    }
}
