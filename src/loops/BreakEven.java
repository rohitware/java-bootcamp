package loops;

public class BreakEven {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i = i + 2) {
            if (i == 12) {
                break;
            }
            System.out.println(i);
        }
    }
}
