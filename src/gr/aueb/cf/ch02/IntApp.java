package gr.aueb.cf.ch02;

/**
 * εμφανιζει τους τυπους δεδομενων ακεραιων,
 * int, byte, short,long μαζι με το μεγεθος τους,
 * και το range (min , max)
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %,d bits, Min: %,d, Max: %,d\n", Integer.TYPE, Integer.BYTES*8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %,d bits, Min: %,d, Max: %,d\n", Byte.TYPE, Byte.BYTES*8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %,d bits, Min: %,d, Max:%,d\n", Short.TYPE, Short.BYTES*8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %,d bits, Min: %,d, Max:%,d\n", Long.TYPE, Long.BYTES*8, Long.MIN_VALUE, Long.MAX_VALUE);

    }
}

//για καθε πρωταρχικο τυπο ακεραιων (int,byte,short,long) υπαρχει μια αντιστοιχη Wrapper κλαση (κλαση περιτυλιγματος) που ξεκιναει με κεφαλαιο γραμμα
//και μας παρεχει τον τυπο δεδομενων (TYPE) , το μεγεθος (BYTES) και min max values