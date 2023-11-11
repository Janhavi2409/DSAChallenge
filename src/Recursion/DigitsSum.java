package Recursion;

import java.util.Scanner;

public class DigitsSum {
    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        }
        return digitSum(n / 10) + digitSum(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits is: " + digitSum(n));
    }
}
