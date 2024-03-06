package Oops.Upcasting;

import java.util.Scanner;

class Car {
    void details() {
    }
}

class RangeRover extends Car {
    @Override
    void details() {
        System.out.println("RangeRover Started");
    }
}

class Benz extends Car {
    @Override
    void details() {
        System.out.println("Benz Started");
    }
}

class Bmw extends Car {
    @Override
    void details() {
        System.out.println("Bmw Started");
    }
}

class Driver {
    void drive(Car c) {
        c.details();
    }
}

public class Drive {
    public static void main(String[] args) {
        System.out.println("Select the car ");
        System.out.println("1-->RangeRover\n2-->Benz\n3-->Bmw");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                new Driver().drive(new RangeRover());
                break;
            case 2:
                new Driver().drive(new Bmw());
                break;
            case 3:
                new Driver().drive(new Benz());
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }

    }
}
