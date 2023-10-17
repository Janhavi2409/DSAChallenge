package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSmallerElement {
    public static void getSmaller(int[] arr, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int j : arr) {
            if (j < x) {
                al.add(j);
            }
        }
        System.out.println("Array is: " + al);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element  " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        getSmaller(arr, x);
    }
}
