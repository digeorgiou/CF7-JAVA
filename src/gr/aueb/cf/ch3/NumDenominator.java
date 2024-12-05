package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0): ");
            numerator = in.nextInt();

            // Βαζω εδω ελεγχο για να μην το κουβαλαω μαζι μου σε περιπτωση που εχω error
            // και να γινει ετσι πιο απλος ο κωδικας

            if (numerator == 0) {
                System.out.println("Numerator is zero. Quiting...");
                break;
            }
            System.out.println("Please insert denominator: ");
        }
    }
}
