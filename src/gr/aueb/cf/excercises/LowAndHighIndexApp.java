package gr.aueb.cf.excercises;

/**
 * Assume an array: {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8}.
 * The app returns the low and high index for a key (integer key)
 * that is included int the array. If the key was 8 the algorithm
 * should return {7, 9} or {8, 10} if we make a tiny user-friendly
 * optimization.
 *
 * Low and High Index Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα στοιχεία.
 * Γράψτε μία μέθοδο int[] getLowAndHighIndexOf(int[] arr, int key) που να υπολογίζει
 * και να επιστρέφει τα low και high index ενός πίνακα arr, για ένα ακέραιο key που
 * λαμβάνει ως παράμετρο. •
 * Γράψτε και μία main() που να βρίσκει το low και high index
 * για τον πίνακα {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8}. Για παράδειγμα,
 * αν δώσουμε ως τιμή το 8, θα πρέπει να επιστρέφει {7, 11}. •
 * Hint. Ελέγξτε αν το key περιέχεται στον πίνακα και σε ποια θέση.
 * Αν ναι, τότε από τη θέση αυτή μετρήστε τα στοιχεία όσο υπάρχουν
 * στοιχεία με ίδια τιμή και μέχρι να βρείτε το τέλος του πίνακα
 */


public class LowAndHighIndexApp {

    public static void main(String[] args) {

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }

        return new int[] { low, high };
    }
}
