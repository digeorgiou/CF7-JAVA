package gr.aueb.cf.ch02;

import java.util.Scanner;
/**
 * Converts years (ages) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        // Εντολες
        System.out.println("Pleage insert your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        //εκτυπωση αποτελεσματων
        System.out.println("Age in years: " + age + ", Age in days: " + days);
    }
}
