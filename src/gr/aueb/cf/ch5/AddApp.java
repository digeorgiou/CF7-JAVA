package gr.aueb.cf.ch5;

/**
 * υπολογιζει το αθροισμα δυο ακεραιων
 * με τη χρηση μεθοδων
 */

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;

        sum = AddApp.add(a,b);
        sub = AddApp.sub(a,b);

        System.out.println(sum);
        System.out.println(sub);

    }

    /**
     * Μπορω να βαλω doc comments πανω απο καθε μεθοδο
     * Adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum
     */
    public static int add(int a, int b){
//        int result = 0;
//
//        result = a + b;
//
//        return result;
        return a + b;
    }
    public static int sub (int a, int b){
        return a-b;
    }
}
