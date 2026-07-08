package methods.returnvalue;

public class RectangleArea {
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int area = calculateArea(20, 30);
        System.out.println("Area is : " + area);
    }
}
