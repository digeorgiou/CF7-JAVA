package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        int[] arr6 = {1};
        swap(arr);
        printArray(arr);
    }

    /**
     * το arr περναει by value (δηλαδη δημιουργειται τοπικο αντιγραφο του στην swap)
     * αλλα ειναι διευθυνση μνημης. τα περιεχομενα που ειναι
     * στο heap δεν περνανε στην μεθοδο. και οι αλλαγες που γινονται στα arr[0] και arr[1]
     * αφορουν στοιχεια που βρισκονται στο heap και ειναι πραγματικα.
     * γι αυτο διατηρουνται οι αλλαγες και στην main.
     * αρα οι συνθετες δομες δεδομενων οπως οι πινακες λεμε οτι περνανε κατ αναφορα (by reference)
     * αφου περναει by value η διευθυνση μνημης που αναφερεται σε καποια δεδομενα, τα οποια
     * μπορουν να αλλαξουν και να διατηρηθουν οι αλλαγες μετα την εξοδο απο τη μεθοδο.
     * @param arr
     */
    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        arr = new int[2];
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
