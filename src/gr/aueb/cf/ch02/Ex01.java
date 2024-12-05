package gr.aueb.cf.ch02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenInput = 0;
        int celc = 0;

        System.out.println("Δώσε την θερμοκρασία σε Fahrenheit: ");
        fahrenInput = in.nextInt();
        celc = ((fahrenInput - 32) * 5)/9;
        System.out.println(celc);

    }
}
