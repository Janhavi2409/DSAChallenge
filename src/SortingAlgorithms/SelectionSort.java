package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    static int getMaxIndex(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i < last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 56, -23, 6, 21, 68, -53, 78, 0, 25, -16};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
