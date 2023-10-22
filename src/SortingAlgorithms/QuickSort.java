package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int pivot = start + (end - start) / 2;
        while (start <= end) {
            while (arr[start] < arr[pivot]) {
                start++;
            }
            while (arr[end] > arr[pivot]) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            quickSort(arr, start, high);
            quickSort(arr, low, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 56, -23, 6, 21, 68, -53, 78, 0, 25, -16};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
