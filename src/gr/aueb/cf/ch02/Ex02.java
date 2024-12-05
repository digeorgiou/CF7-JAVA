package gr.aueb.cf.ch02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dayInput = 0;
        int monthInput = 0;
        int yearInput = 0;

        System.out.print("Δώσε ημέρα: ");
        dayInput = in.nextInt();
        System.out.print("Δώσε μήνα: ");
        monthInput = in.nextInt();
        System.out.print("Δώσε χρονιά: ");
        yearInput = in.nextInt();

        System.out.printf("%02d/%02d/%04d",dayInput,monthInput,yearInput);
    }
}
