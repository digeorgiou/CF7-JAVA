package gr.aueb.cf.ch04;

import java.util.Scanner;

public class DisektoApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isDisekto = false;

        System.out.println("Please say a year: ");
        year = in.nextInt();

        isDisekto = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if(isDisekto)
            System.out.printf("Το ετος %d ειναι δίσεκτο!", year);
        else
            System.out.printf("Το ετος %d δεν ειναι δισεκτο", year);




    }
}
