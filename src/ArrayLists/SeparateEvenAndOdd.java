package ArrayLists;

import java.util.*;

public class SeparateEvenAndOdd {
    public static void getEvenOdd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0) {
                even.add(j);
            } else {
                odd.add(j);
            }
        }
        System.out.print("Even arraylist: ");
        System.out.println(even);
        System.out.print("Odd arraylist: ");
        System.out.println(odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        getEvenOdd(arr);
    }
}
