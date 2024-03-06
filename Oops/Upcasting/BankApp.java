package Oops.Upcasting;

import java.util.Scanner;

class Bank {
    double rateOfInterest() {
        return 0.0;
    }
}

class ICICI extends Bank {
    double rateOfInterest() {
        return 0.15;
    }
}

class HDFC extends Bank {
    double rateOfInterest() {
        return 0.10;
    }
}

class SBI extends Bank {
    @Override
    double rateOfInterest() {
        return 0.08;
    }
}

class Salesman {
    void provideLoan(Bank b,int amount) {
        System.out.println(
                "The rate of interest in " + b.getClass().getSimpleName() + " is " + (b.rateOfInterest() * 100) + "%");
        System.out.println("The interest for the entered amonut is "+amount*b.rateOfInterest());
    }
}

public class BankApp {
    public static void main(String[] args) {
        Salesman salesman1 = new Salesman();
        System.out.println("Enter amount");
        int amnt = new Scanner(System.in).nextInt();
        System.out.println("Enter 1->SBI\n2->HDFC\n3->ICICI");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                salesman1.provideLoan(new SBI(),amnt);
                break;
            case 2:
                salesman1.provideLoan(new HDFC(),amnt);
                break;
            case 3:
                salesman1.provideLoan(new ICICI(),amnt);
                break;

            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }
}
