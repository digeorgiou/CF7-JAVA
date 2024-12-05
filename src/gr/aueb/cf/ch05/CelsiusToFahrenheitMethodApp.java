package gr.aueb.cf.ch05;

import java.util.Scanner;

public class CelsiusToFahrenheitMethodApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celsius ;

        System.out.println("Please enter temperature in Celsius");
        celsius = in.nextDouble();


        System.out.printf("%.2f degrees in celsius is %.2f degrees Fahrenheit",celsius,celsiusToFahrenheit(celsius) );
    }

    public static double celsiusToFahrenheit(double celsius){
        return celsius * 9/5 + 32;
    }
}
