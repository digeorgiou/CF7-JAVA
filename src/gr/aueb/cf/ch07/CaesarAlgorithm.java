package gr.aueb.cf.ch07;

import java.util.Scanner;

public class CaesarAlgorithm {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please Insert Word: ");
        String s1 = s.nextLine();
        String s1Lower = s1.toLowerCase();
        System.out.println("Please Insert Step: ");
        int step = s.nextInt();
        int newPosition ;
        StringBuilder s2 = new StringBuilder(s1.length());
        int newCharAscii;

        for (int i = 0 ; i < s1.length() ; i++){
            if (Character.isLetter(s1Lower.charAt(i))){
                newCharAscii = ((int) s1Lower.charAt(i)) + step;
                if (newCharAscii > 122 ) {
                    newPosition = 96 + ((newCharAscii) % 122);
                    s2.append((char) newPosition);
                }else s2.append((char) newCharAscii);
            }
           else s2.append(s1Lower.charAt(i));
           if (Character.isUpperCase(s1.charAt(i))){
               s2.replace(i,i+1,s2.substring(i,i+1).toUpperCase());
           }
        }
       System.out.println(s2);
    }
}
