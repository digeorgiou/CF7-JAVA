package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο αριστερά ψηφίο
 * ενός ακεραίου.
 */

public class FirstDigitFinder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int firstDigit;

        System.out.println("enter a positive number: ");
        num = in.nextInt();

        while (num/10 != 0) {
            num = num / 10;
        }

        firstDigit = num;

        System.out.println(firstDigit);
    }
    }