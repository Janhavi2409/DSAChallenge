package Recursion;

import java.util.Scanner;

// fibonacci series : 0 1 1 2 3 5 8 13 21 ...
public class FibonacciSearch {
    public static int fibSearch(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibSearch(n - 1) + fibSearch(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: "+fibSearch(n));
    }
}
