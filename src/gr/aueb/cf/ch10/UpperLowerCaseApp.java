package gr.aueb.cf.ch10;

import java.util.Scanner;

public class UpperLowerCaseApp {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        String s1;
        char ch;

        System.out.println("Please insert a string:");
        s1= in.nextLine();

        for (int i = 0 ; i < s1.length() ; i++){
            ch = s1.charAt(i);
            if(Character.isLetter(ch)){
                if (i % 2 == 0){
                    sb.append(Character.toUpperCase(ch));
                }else{
                    sb.append(Character.toLowerCase(ch));
                }
            }else sb.append(ch);
        }

        System.out.println(sb);


    }
}
