package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common
 * use case that is conditional assignment
 * abs(num)
 */

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("Please enter a num");
        num = in.nextInt();

        // if(num >= 0) abs = num;
        // else abs = -num;
        // αντι για το παραπανω μπορω να το γραψω με
        // το ? για πιο γρηγορα.

        abs = (num>=0) ? num : -num;

        System.out.println("abs: " + abs);

    }
}
