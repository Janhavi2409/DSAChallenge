package OOP.DataAbstraction;

import java.util.Scanner;

abstract class Area {
    abstract void area(double base, double height, String unit);
}

class TriangleArea extends Area {
    @Override
    void area(double base, double height, String unit) {
        System.out.println("Area of triangle = " + (0.5 * base * height) + " sq." + unit);
    }
}

class RectangleArea extends Area {
    @Override
    void area(double base, double height, String unit) {
        System.out.println("Area of rectangle = " + (base * height) + " sq." + unit);
    }
}

public class AreaImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.print("Enter units: ");
        String unit = sc.next();
        TriangleArea ta = new TriangleArea();
        RectangleArea ra = new RectangleArea();
        ta.area(base, height, unit);
        ra.area(base, height, unit);
    }
}
