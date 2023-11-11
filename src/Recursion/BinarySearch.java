package Recursion;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == array[mid]) {
            return mid;
        } else if (target > array[mid]) {
            return binarySearch(array, mid + 1, array.length - 1, target);
        }
        return binarySearch(array, 0, mid - 1, target);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.print("Element found at index: ");
        System.out.println(binarySearch(array, 0, array.length - 1, target));
    }
}