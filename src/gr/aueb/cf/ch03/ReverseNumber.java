package gr.aueb.cf.ch03;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int modNum = 0;

        System.out.println("Please insert number: ");
        num = in.nextInt();

        while (num > 0) {
            modNum = num % 10;
            reversed = reversed * 10 + modNum;
            num /= 10;}

        System.out.println(reversed
        );
    }
}
