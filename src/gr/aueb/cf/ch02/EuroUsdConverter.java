package gr.aueb.cf.ch02;
import java.util.Scanner;
public class EuroUsdConverter {

    public static void main(String[] args) {
        //Δήλωση και Αρχικοποιηση Μεταβλητών
        Scanner in = new Scanner(System.in);
        int euro1 = 0;
        int dollars1 = 0;
        int cents1 = 0;

        //ΕντολέςS
        System.out.println("Enter amount in euro: ");
        euro1 = in.nextInt();
        dollars1 = euro1*99/100;
        cents1 = (euro1*99)%100;
        System.out.printf( "your %d euro is %d dollars and %d cents",euro1,dollars1,cents1);

    }
}
