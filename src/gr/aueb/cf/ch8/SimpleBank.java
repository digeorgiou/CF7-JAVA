package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            printMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    try{
                        deposit(100);
                    }catch(IllegalArgumentException e){
                        System.out.println("Amount must be positive. Please try again");
                    }
                    break;
                case 2:
                    try{
                        withdraw(50);
                    }catch(IllegalArgumentException e){
                        System.out.println("Wrong amount. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Bank. Goodbye! ");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void deposit (double amount) {
        try {
            if (amount <= 0){
                throw new IllegalArgumentException("Input Negative");
            }
            balance += amount;
            System.out.println("Successfully Deposited: " + amount);
        } catch (IllegalArgumentException e){
            System.err.println("Error" + e.getMessage());
            throw e;
        }
    }

    public static void withdraw(double amount) {
        try{
            if (amount > balance || amount < 0){
                throw new IllegalArgumentException("Amount out of bounds");
            }
            balance -= amount;
            System.out.println("Successfully Withdrawn: " + amount);
        }catch(IllegalArgumentException e){
            System.err.println("Error" + e.getMessage());;
            throw e;
        }

    }

    public static void printMenu() {
        System.out.println("--- Simple Bank Menu ---");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Choose an option: ");
    }

    public static int getChoice() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Wrong input, please insert int: ");
            scan.nextLine();
        }
        int choice = scan.nextInt();

        return choice;
    }

}
