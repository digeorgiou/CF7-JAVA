package gr.aueb.cf.ch6;

/** Δηλωση και αρχικοποιηση ενος πινακα
 * Populate ενος πινακα
 * -new
 * -unsized init
 * -array initializer
 * -print τα στοιχεια ενος πινακα
 */

public class ArrayInit {
    public static void main(String[] args) {

        int[] arr = new int[3];                         // declare and init
        int[] arr2 = {1, 2, 3, 4, 5};                   // εδω δεν χρειαζεται να δωσουμε new. (ειναι το unsized initialization)
        int[] arr3 = new int[]{1, 2, 3, 4, 5};          // array initializer

        // Populate
        arr[0] = 5;
        // το [0] λεγεται indexer
        arr[1] = 10;
        arr[2] = 4;

        // traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int el : arr3){
            System.out.println(el + " ");         // Enhanced for  . Εδω δεν εχουμε index. οποτε
                                                  // αν τον χρειαζομαστε δεν χρησιμοποιουμε αυτον τον τροπο
        }                                         // χρησιμοποιειται για πιο ευκολη εκτυπωση
    }
}
