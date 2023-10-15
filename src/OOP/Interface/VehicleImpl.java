package OOP.Interface;

import java.util.Scanner;

interface Vehicle {
    void gearChange();

    void speedUp();

    void applyBreak();
}

class Bicycle implements Vehicle {
    @Override
    public void gearChange() {
        System.out.println("Gears of bicycle are changing");
    }

    @Override
    public void speedUp() {
        System.out.println("bicycle is speeding up");
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks a being applied on bicycle");
    }
}

class Bike implements Vehicle {
    @Override
    public void gearChange() {
        System.out.println("Gears of bike are changing");
    }

    @Override
    public void speedUp() {
        System.out.println("Bike is speeding up");
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks a being applied on bike");
    }
}

class Car implements Vehicle {
    @Override
    public void gearChange() {
        System.out.println("Gears of car are changing");
    }

    @Override
    public void speedUp() {
        System.out.println("car is speeding up");
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks a being applied on car");
    }
}

public class VehicleImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Bicycle");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.print("Choose your vehicle type: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                Bicycle bicycle = new Bicycle();
                bicycle.gearChange();
                bicycle.speedUp();
                bicycle.applyBreak();
            }
            case 2 -> {
                Bike bike = new Bike();
                bike.gearChange();
                bike.speedUp();
                bike.applyBreak();
            }
            case 3 -> {
                Car car = new Car();
                car.gearChange();
                car.speedUp();
                car.applyBreak();
            }
            default -> System.out.println("Invalid choice...");
        }
    }
}