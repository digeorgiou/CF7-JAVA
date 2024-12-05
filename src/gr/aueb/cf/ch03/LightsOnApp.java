package gr.aueb.cf.ch03;

import java.util.Scanner;

/**
 * Turn lights on, if it is dark
 * AND car is running (>100> OR is raining
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        int carSpeed = 0;
        boolean isLightsOn = false;
        boolean isRaining = false;

        System.out.println("Is it dark (true or false): ");
        isDark = in.nextBoolean();

        System.out.println("Is it raining (true or false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the car speed (km/h): ");
        carSpeed = in.nextInt();

        isLightsOn = carSpeed > 100 && isRaining || isDark;

        System.out.println("Lightes are " + isLightsOn);
    }
}
