package Recursion;

import java.util.Arrays;

public class isSorted {
    public static boolean issorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        return array[index] < array[index + 1] && issorted(array, index + 1);
    }
    public static void main(String[] args) {
        int[] array = {8, 9, 2, 4, 6, 1, 5, 7};
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Array is sorted: " + issorted(array, 0));
        System.out.println("Array: "+ Arrays.toString(array1));
        System.out.println("Array is sorted: " + issorted(array1, 0));
    }
}
