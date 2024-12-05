package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int digit = 0;
        System.out.println("Enter a positive integer: ");
        num = in.nextInt();

        while(num!=0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
