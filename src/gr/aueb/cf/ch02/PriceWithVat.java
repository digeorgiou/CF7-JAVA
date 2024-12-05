package gr.aueb.cf.ch02;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */
public class PriceWithVat {

    public static void main(String[] args) {

        final double VAT = 0.24;
        double priceInput = 0.0;
        double finalPrice = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώσε τιμη: ");
        priceInput = in.nextDouble();
        finalPrice = priceInput + (priceInput * VAT);

        System.out.println("Η τιμη μαζι με τον ΦΠΑ ειναι: " + finalPrice);

    }
}
