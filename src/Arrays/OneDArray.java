package Arrays;

public class OneDArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
