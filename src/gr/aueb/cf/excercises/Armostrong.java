package gr.aueb.cf.excercises;

import java.util.Scanner;

public class Armostrong {
    public static void main(String[] args) {
    }

     public boolean isArmstrong(int input) {
         int num = input;
         int temp = num;
         int sum = 0;
         int numberOfDigits = 0;

         while (temp != 0) {
             numberOfDigits += 1;
             temp /= 10;
         }

         int[] digits = new int[numberOfDigits];
         temp = num;
         for (int i = 0; i < numberOfDigits; i++) {
             digits[i] = temp % 10;
             temp = temp / 10;
         }

         for (int digit : digits) {
             sum += Math.pow(digit, numberOfDigits);
         }

         return (sum == num);
     }
}

