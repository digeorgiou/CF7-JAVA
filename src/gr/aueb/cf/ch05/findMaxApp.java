package gr.aueb.cf.ch05;


import java.util.Scanner;

import static java.lang.Math.max;

public class findMaxApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a , b , c;
        System.out.println("Enter 3 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(findMax(a,b,c));

    }

    public static int findMax(int a, int b, int c){
        return max(max(a,b),c);
    }
}
