package gr.aueb.cf.ch07;

public class Exercises {

    public static void main(String[] args) {


        String s1 = "Dimitris";
        StringBuilder s2 = new StringBuilder(s1.length());

        for (int i = 0; i < s1.length() ; i++) {
            int asciiNewChar = ((int) s1.charAt(i)) + 1;
            char newChar = (char) asciiNewChar;
            s2.append(newChar);
        }

        String s3 = s2.toString();
        System.out.println(s3);

        StringBuilder s4 = new StringBuilder(s1.length());
        for (int i = 0; i < s1.length() ; i++) {
            int asciiNewChar = ((int) s3.charAt(i)) - 1;
            char newChar = (char) asciiNewChar;
            s4.append(newChar);
        }
        String s5 = s4.toString();
        System.out.println(s5);

    }
}

