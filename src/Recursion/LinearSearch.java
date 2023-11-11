package Recursion;

import java.util.Arrays;

public class LinearSearch {
    public static int linearsearch(int[] array, int index, int target) {
        if (index == array.length) {
            return -1;
        } else if (array[index] == target) {
            return index;
        }
        return linearsearch(array, index + 1, target);
    }

    public static void main(String[] args) {
        int[] array = {8, 9, 2, 4, 6, 1, 5, 7};
        int target = 10;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);
        System.out.print("Element found at: " + linearsearch(array, 0, target));
    }
}