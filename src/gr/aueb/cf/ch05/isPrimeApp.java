package gr.aueb.cf.ch05;

import java.util.Scanner;

public class isPrimeApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = 0;

        System.out.println("enter number to check if its prime");
        number = in.nextInt();

        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int a){

        if (a <= 1)
            return false;
        for(int i = 2 ; i < a ; i++){
            if (a % i == 0)
                return false;
            else
                continue;
        }
        return true;
    }
}
