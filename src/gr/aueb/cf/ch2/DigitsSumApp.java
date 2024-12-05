package gr.aueb.cf.ch2;
import java.util.Scanner;

public class DigitsSumApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberInput = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int sum = 0;

        System.out.println("Δωσε εναν διψηφιο ακεραιο");
        numberInput = in.nextInt();
        firstDigit = numberInput / 10;
        secondDigit = numberInput % 10;
        sum = firstDigit + secondDigit;
        System.out.printf("Το αθροισμα των ψηφιων ειναι %d", sum);




    }
}
