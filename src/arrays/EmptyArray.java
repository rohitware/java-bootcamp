package arrays;

public class EmptyArray {
    public static void main(String[] args) {
        int[] emptyArray = new int[5]; // Creating an empty array
        System.out.println("Length of the empty array: " + emptyArray.length);
        System.out.println("Elements of the empty array:");
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println(emptyArray[i]);
        }

        int[] assignedArray = new int[5]; // Creating an empty array of size 5
        // Assigning values to the empty array
        assignedArray[0] = 10;
        assignedArray[1] = 20;
        assignedArray[2] = 30;
        assignedArray[3] = 40;
        assignedArray[4] = 50;
        // Printing the values of the array
        System.out.println("Elements of the array after assignment:");
        for (int i = 0; i < assignedArray.length; i++) {
            System.out.println(assignedArray[i]);
        }

    }
}
