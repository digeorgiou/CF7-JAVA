package gr.aueb.cf.ch04;

import java.util.Scanner;

public class SwitchCaseFallThrough {

    public static void main(String[] args) {
        int grade ;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excelent");
                break;
            default:
                System.out.println("Error in grade.");
                break;
        }
    }
}
