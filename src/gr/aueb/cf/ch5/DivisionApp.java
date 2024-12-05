package gr.aueb.cf.ch5;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {

        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d;
        double mod = 0.0;
        float myFloat = 4.5f;
        //εδω πρεπει να βαλω f για να μην γινει error typecast.
        //ο 4.5 σκετος ειναι double. βαζω f για να μετατραπει σε float πριν
        // τον αντιστοιχισω με μεταβλητη float.
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two doubles");
        num1 = in.nextDouble();
        num2 = in.nextDouble();

        div = num1 / num2;
        mod = num1 % num2;


        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f\n", mod);
    }
}
