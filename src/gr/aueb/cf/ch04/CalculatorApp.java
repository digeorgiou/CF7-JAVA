package gr.aueb.cf.ch04;

import java.util.Scanner;

/**
 * Διαβαζει απ τον χρηστη εναν αριθμο (ακεραιο) ,
 * ενα συμβολο πραξης και ακομα εναν ακεραιο και
 * εκτελει την πραξη αναλογα με το συμβολο που εχει δοθει
 * +, -, *, /, %
 */
public class CalculatorApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b;
        int sum;
        int sub;
        int mul;
        int div;
        int mod;
        char operator = ' ';

        System.out.println("Insert an int, an operator and a second int: ");
        a = in.nextInt();
        operator = in.next().charAt(0);
        b = in.nextInt();

        switch(operator){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid input");
        }




    }
}
