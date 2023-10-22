package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 56, -23, 6, 21, 68, -53, 78, 0, 25, -16};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
