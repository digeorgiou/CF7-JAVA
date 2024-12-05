package gr.aueb.cf.ch08;
import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {

        try {
            System.out.println(getChoice());
        }catch(IllegalArgumentException e){
            System.out.println("Number must be between 1-5");
        }

    }

    public static void printMenu() {
        System.out.println("1. Search: ");
        System.out.println("2. Delete: ");
        System.out.println("3. Insert: ");
        System.out.println("4. Update: ");
        System.out.println("5. Exit: ");
    }

    public static int getChoice() throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Wrong input, please insert int: ");
        }
        int choice = scan.nextInt();

        try {
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("Number out of bounds");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }

        return choice;
    }



}
