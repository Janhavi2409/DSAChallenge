package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 65, 12, 78, 90};
        int target = 12;
        for (int j : arr) {
            if (j == target) {
                System.out.println("Element found...");
            } else {
                System.out.println("Element not found...");
            }
        }
    }
}
