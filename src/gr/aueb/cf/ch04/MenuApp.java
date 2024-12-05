package gr.aueb.cf.ch04;

import java.util.Scanner;

/**
 * • Εμφανίστε επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4 θα πρέπει
 * να εμφανίζεται feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα “Επιλέξατε Εισαγωγή».
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5 και να δίνετε κατάλληλο μήνυμα.
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Ενημέρωση
 * 4. Αναζήτηση
 * 5. Έξοδος
 */

public class MenuApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 1;

        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");

        while(true){
            choice = in.nextInt();
            if (choice > 5 || choice <=0){
                System.out.println("Invalid number, Please enter again: ");
                continue;
            }
            else if(choice == 5){
                System.out.println("Goodbye!");
                break;
            }
            else if(choice == 1){
                System.out.println("Επιλέξατε Εισαγωγή");
            }
            else if(choice == 2){
                System.out.println("Επιλέξατε Διαγραφή");
            }
            else if(choice ==3){
                System.out.println("Επιλέξατε Ενημέρωση");
            }
            else
                System.out.println("Επιλέξατε Αναζήτηση");
        }



    }
}
