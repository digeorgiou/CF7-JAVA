package gr.aueb.cf.ch04;

import java.math.BigInteger;

/**
 * calculates a^n
 *
 */
public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 10;
        int result = 1;

        for (int i = 1 ; i <= power ; i++) {
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println(result);
        System.out.println(bigResult);

    }
}
