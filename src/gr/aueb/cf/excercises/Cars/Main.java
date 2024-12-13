package gr.aueb.cf.excercises.Cars;

import java.util.Arrays;
import java.util.Comparator;

/**
 Max Cars Έστω ένας δισδιάστατος πίνακας που περιέχει τα στοιχεία άφιξης και αναχώρησης
 αυτοκινήτων σε
 μορφή arr[][] = {{1012, 1136}, {1317, 1417}, {1015, 1020}} Αναπτύξτε μία εφαρμογή που
 διαβάζει να εκτυπώνει
 τον μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 Για παράδειγμα, στον παραπάνω πίνακα το αποτέλεσμα θα πρέπει να είναι: 2.
 Το 1ο αυτοκίνητο αφίχθη στις 10:12 και αναχώρησε στις 11:36, το 3ο αυτοκίνητο αφίχθη στις 10:15
 και αναχώρησε στις 10:20. Επομένως, το 1ο και το 3ο αυτοκίνητο ήταν παρόντα το ίδιο χρονικό διάστημα.
 Hint. Με βάση τον αρχικό πίνακα, δημιουργήστε ένα δισδιάστατο πίνακα που σε κάθε γραμμή θα περιέχει
 δύο πεδία int. Στο πρώτο πεδίο θα εισάγεται η ώρα άφιξης ή αναχώρησης από τον αρχικό πίνακα
 και στο 2 ο πεδίο θα εισάγεται ο αριθμός 1 αν πρόκειται για άφιξη και 0 αν πρόκειται για αναχώρηση.
 Ταξινομήστε τον πίνακα σε αύξουσα σειρά με βάση την ώρα. Στη συνέχεια υπολογίστε το μέγιστο
 αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα με ένα πέρασμα του πίνακα.
 */



public class Main {

    public static void main(String[] args) {
        int[][] arr3 = new int[][] { {1012, 1056}, {1022, 1023}, {1317, 1417}, {1025, 1035}, {1027, 1034}};
        int[][] arr4 = new int[2* arr3.length][2];
        int maxCount = 0;
        int count = 0;

        arr4 = returnNew2dTable(arr3);
        sortByTime(arr4);

        for (int i = 0 ; i < arr4.length ; i++){
            if(arr4[i][1] == 1){
                count += 1;
            }else {
                count -= 1;
            }
            if(count > maxCount){
                maxCount = count;
            }
        }

        System.out.println("Max Count is: " + maxCount);
    }


    /* Hint. Με βάση τον αρχικό πίνακα, δημιουργήστε ένα δυσδιάστατο
    πίνακα που σε κάθε γραμμή θα περιέχει δύο πεδία int.
    Στο πρώτο πεδίο θα εισάγεται η ώρα άφιξης ή αναχώρησης
     από τον αρχικό πίνακα και στο 2ο πεδίο θα εισάγεται ο αριθμός 1
     αν πρόκειται για άφιξη και 0 αν πρόκειται για αναχώρηση.
     */

    public static int[][] returnNew2dTable(int[][] arr2d) {
        int[][] newTable = new int[2 * arr2d.length][2];
        for (int i = 0; i < arr2d.length; i++) {
            newTable[2*i][0] = arr2d[i][0];
            newTable[2*i][1] = 1;
            newTable[2*i + 1][0] = arr2d[i][1];
            newTable[2*i + 1][1]= 0;
        }
        return newTable;

    }

    public static void printArray(int[] arr) {
        for (var elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void printArrayTwoD(int[][] arrTwoD) {
        for (int i = 0; i < arrTwoD.length; i++) {
            System.out.println("-----------------------------");
            for (int j = 0; j < arrTwoD[i].length; j++) {
                System.out.printf("%02d ", arrTwoD[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }
}
