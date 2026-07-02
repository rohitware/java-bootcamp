package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasDegree = true;
        boolean knowsJava = true;
        boolean knowsSpringBoot = false;

        System.out.println("Has Degree: " + hasDegree);
        System.out.println("Knows Java: " + knowsJava);
        System.out.println("Knows Spring Boot: " + knowsSpringBoot);

        System.out.println("------------------------------");

        System.out.println("Eligible for job: " + (hasDegree && knowsJava));
        System.out.println("Eligible for Intern: " + (hasDegree || knowsSpringBoot));
        System.out.println("Spring Boot known: " + (!knowsSpringBoot));
    }
}
