package gr.aueb.cf.ch04;

import java.util.Scanner;

public class AsterakiaApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Give me stars number");
        int num = in.nextInt();

        System.out.println("n οριζοντια αστερια");
        System.out.println("-----------");
        for (int i = 1; i <= num; i++) {
            System.out.print("* ");
        }

        System.out.println("\n-----------");
        System.out.println("n καθετα αστερια");
        System.out.println("-----------");
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
        System.out.println("\n-----------");

        System.out.println("nxn αστερια");
        System.out.println("-----------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\n-----------");
        System.out.println("απο 1 ως n αστερια");
        System.out.println("-----------");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\n-----------");
        System.out.println("απο n ως 1 αστερια");
        System.out.println("-----------");

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
