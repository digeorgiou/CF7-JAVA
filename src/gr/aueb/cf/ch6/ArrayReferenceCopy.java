package gr.aueb.cf.ch6;

/**
 * Copies the reference of the array.
 * it is a shallow copy.
 * επειδη αντιγραφεται η αναφορα στα δεδομενα κι οχι τα δεδομενα.
 * There are side effects
 *
 */
public class ArrayReferenceCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;         // Shallow Copy

        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }

        arrRefCopy[4] = 100;
        //αλλαζουμε τα στοιχεια του arrRefCopy
        //και αλλαζουν και τα στοιχεια του arr. Αυτο ειναι side effect.
        // Αν δεν θελουμε να συμβαινει αυτο κανουμε deep copy με new.

        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}