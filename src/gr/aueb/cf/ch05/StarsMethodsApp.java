package gr.aueb.cf.ch05;

import java.util.Scanner;

public class StarsMethodsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;
        int starsnumber = 0;

        System.out.println("How many stars would you like? ");
        starsnumber = in.nextInt();

        outer:while (true){

            printmenu(starsnumber);
            choice = in.nextInt();
            System.out.println("----------------------------");
            switch (choice){
                case 1:
                    orizontia(starsnumber);
                    System.out.println(" ");
                    System.out.println("----------------------------");
                    break;
                case 2 :
                    katheta(starsnumber);
                    System.out.println("----------------------------");
                    break;
                case 3 :
                    for (int i = 1; i <= starsnumber ; i++){
                        orizontia(starsnumber);
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------");
                    break;
                case 4 :
                    for (int i = 1; i <= starsnumber ; i++){
                        orizontia(i);
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------");
                    break;
                case 5 :
                    for (int i = 0; i < starsnumber ; i++){
                        orizontia(starsnumber - i);
                        System.out.println(" ");
                    }
                    System.out.println("----------------------------");
                    break;

                case 6:
                    System.out.println(" Goodbye, thanks for using the StarsApp");
                    break outer;

                default:
                    System.out.println("Number must be between 1 and 6");
                    System.out.println("----------------------------");

            }

        }
    }
    public static void printmenu(int n) {
        System.out.println("1. Εμφάνισε " + n + " αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε " + n + " αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε " + n + " γραμμές με " + n + " αστεράκια");
        System.out.println("4. Εμφάνισε " + n + " γραμμές με αστεράκια 1 έως " +  n);
        System.out.println("5. Εμφάνισε " + n + " γραμμές με αστεράκια " + n + " έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }
    public static void orizontia(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }

    public static void katheta(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

}
