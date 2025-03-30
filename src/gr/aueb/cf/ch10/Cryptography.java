package gr.aueb.cf.ch10;

import java.util.Scanner;

public class Cryptography {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1;

        s1 = sc.nextLine();

        int[] arr = encryptFirst(s1);
        printArray(arr);

        String s2;

        s2 = decryptFirst(arr);
        System.out.println("Decrypted message : " + s2);

    }

    public static void printArray(int[] arr){
        for (int elem : arr ){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int[] encryptFirst(String input){
        int[] result = new int[input.length()];

        result[0] = (int)input.charAt(0);

        for(int i = 1 ; i < input.length(); i++){
            if(input.charAt(i) == '#') result[i] = -1;
            else result[i] = (int)input.charAt(i) + result[i-1];
        }

        return result;

    }

    public static String decryptFirst(int[] arr){
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == - 1) sb.append('#');
            else{
            sb.append((char) (arr[i] - sum));
            sum += arr[i];
                System.out.println(sum);
            }
        }
        return sb.toString();
    }
}
