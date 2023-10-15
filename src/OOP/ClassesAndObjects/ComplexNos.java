package OOP.ClassesAndObjects;

import java.util.Scanner;

class Complex {
    double r1;
    double i1;
    double r2;
    double i2;

    public Complex(double r1, double i1, double r2, double i2) {
        this.r1 = r1;
        this.i1 = i1;
        this.r2 = r2;
        this.i2 = i2;
    }

    void display(double r, double i) {
        if (i >= 0) {
            System.out.print(r + "+");
            System.out.print(i + "i");
        } else {
            System.out.print(r);
            System.out.print(i + "i");
        }
    }

    void add() {
        double r = this.r1 + this.r2;
        double i = this.i1 + this.i2;
        display(r, i);
    }

    void subtract() {
        double r = this.r1 - this.r2;
        double i = this.i1 - this.i2;
        display(r, i);
    }

    void multiply() {
        double r = (this.r1 * this.r2) - (this.i1 * this.i2);
        double i = (this.r1 * this.i2) + (this.r2 * this.i1);
        display(r, i);
    }

    void divide() {
        double i21 = -i2;
        double d = (this.r2 * this.r2) + (this.i2 * this.i2);
        double nr = (this.r1 * this.r2) + (-1) * (this.i1 * i21);
        double ni = (this.r1 * i21) + (this.i1 * this.r2);
        double r = nr / d;
        double i = ni / d;
        display(r, i);
    }
}

public class ComplexNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R1: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter I1: ");
        double i1 = sc.nextDouble();
        System.out.print("Enter R2: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter I2: ");
        double i2 = sc.nextDouble();
        Complex complex = new Complex(r1, i1, r2, i2);
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> complex.add();
            case 2 -> complex.subtract();
            case 3 -> complex.multiply();
            case 4 -> complex.divide();
            default -> System.out.println("Invalid choice");
        }
    }
}

