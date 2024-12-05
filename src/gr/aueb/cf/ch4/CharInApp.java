package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Reads a char as a byte
 *
 */

public class CharInApp {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        char cc ;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character");
        //ch = (char) System.in.read();
        ch = in.nextLine().charAt(0);
        cc = "Hello".charAt(0);

        System.out.printf("%c", ch);
        System.out.println(cc);

    }
}
