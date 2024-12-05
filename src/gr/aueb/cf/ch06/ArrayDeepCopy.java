package gr.aueb.cf.ch06;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        copied = arrDeepCopy(arr);
        // το copied ειναι δεικτης που δειχνει εκει που εδειχνε
        // ο destination που ηταν κι αυτος δεικτης, αλλα δεν υπαρχει πια.
        // ηταν τοπικη μεταβλητη για την μεθοδο arrDeppCopy
    }

    /**
     * it creates a fresh-copy (deep copy) of an
     * input array.
     *
     * @param source    the source array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        // εναλλακτικα μπορουμε να χρησιμοποιησουμε τις παρακατω ετοιμες μεθοδους.
        // ειτε απο το System , ειτε απο την κλαση Arrays
//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}