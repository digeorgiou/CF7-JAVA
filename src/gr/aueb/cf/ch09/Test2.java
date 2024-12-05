package gr.aueb.cf.ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        String line;
        String[] tokens;



        File inputFile = new File("C:/Users/digeo/Documents/inputCodes2.txt");
        try (Scanner in = new Scanner(inputFile)){

            int safeCount = 0;
            for (int i = 0 ; i < 1000 ; i++) {
                line = in.nextLine();
                tokens = line.split("\\s+");
                int counter = 0;
                if (isSafe(tokens)){
                    safeCount++;
                }else {
                    for (int j = 0 ; j < tokens.length ; j++ ){
                        if (isSafe(newRemoveElement(tokens, j))){
                            counter ++;
                        }
                    }
                    if (counter > 0){
                        safeCount ++;
                    }
                }
            }
            System.out.println(safeCount);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static boolean isSafe(String[] tokens){
        int difference = 0;
        int posCount = 0;
        int negCount = 0;
        boolean posneg = false;

        for(int j = 1 ; j < tokens.length ; j++){
            difference = Integer.parseInt(tokens[j]) - Integer.parseInt(tokens[j-1]);
            if (difference > 0 && difference < 4) {
                posCount ++;
            }
            if (difference < 0 && difference > -4) {
                negCount ++;
            }
        }
//                rows = rowCount == (tokens.length - 1);
        posneg = (posCount == (tokens.length - 1) || negCount == (tokens.length - 1));
        return posneg;

    }
    public static String[] newRemoveElement(String[] array, int index) {
        String[] result = new String[array.length - 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, result.length - index);
        return result;
    }

    public static String[] removeElement(String[] tokens, int index){
        String[] newTokens = new String[tokens.length - 1];
        if (index == 0){
            for (int k = 0 ; k < tokens.length - 2 ; k++){
                newTokens[k] = tokens[k+1];
            }
        }
        else if (index > 0){
                for (int i = 0 ; i < index ; i++){
                newTokens[i] = tokens[i];
            }
        }
        else if (index < tokens.length-1){
            for(int j = 0 ; j > index ; j++){
                newTokens[j] = tokens[j];
            }
        }
        return newTokens;
    }

    public static void printArray(String[] arr) {
        for (String el : arr) {
            System.out.print(el + " ");
        }
    }


}
