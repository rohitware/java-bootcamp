package methods.returnvalue;

public class VotingEligibility {
    public static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        boolean result = isEligible(20);
        System.out.println(result);
    }
}
