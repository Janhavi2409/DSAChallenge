package Recursion;

import java.util.Scanner;

public class _1toN {
    public static void _1ton(int n) {
        if (n == 0) {
            return;
        }
        _1ton(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        _1ton(n);
    }
}
