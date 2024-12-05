package gr.aueb.cf.ch2;
import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;

        System.out.println("Enter Days: ");
        inputDays = in.nextInt();
        System.out.println("Enter Hours: ");
        inputHours = in.nextInt();
        System.out.println("Enter Minutes: ");
        inputMinutes = in.nextInt();
        System.out.println("Enter Seconds: ");
        inputSeconds = in.nextInt();
        totalSeconds = (86400 * inputDays) + (3600 * inputHours) + (60 * inputMinutes) + inputSeconds;
        System.out.printf("The result is %,d seconds",totalSeconds);
    }
}
