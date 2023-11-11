package Recursion;

import java.util.Scanner;

public class SumNto1 {
    public static int sumnto1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumnto1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Sum of 1 to " + n + " numbers is: " + sumnto1(n));
    }
}
