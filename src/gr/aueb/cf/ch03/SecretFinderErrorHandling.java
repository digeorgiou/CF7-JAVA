package gr.aueb.cf.ch03;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while(true) {
            System.out.println("Insert num to guess the secret");
            num = in.nextInt();
//προτιμαμε πρωτα να ελεγχουμε το λαθος και μετα να πηγαινουμε στο σωστο. ετσι ειναι
// πιο σωστος ο κωδικας. Θελουμε να ειναι πιο linear.
            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("Bingo!");
            break;
        }
    }
}
