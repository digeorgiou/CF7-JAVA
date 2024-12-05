package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        String line;
        String[] tokens;
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();


        File inputFile = new File("C:/Users/digeo/Documents/inputCodes3.txt");
        try (Scanner in = new Scanner(inputFile)) {
            in.useDelimiter("mul\\(");
            while (in.hasNext()) {
                line = in.next();
                tokens = line.split("don't\\(\\)");
                for (int i = 0 ; i < tokens.length ; i++){
                        a.add(tokens[i]);
                }
            }

            for (String elem : a){;
                if(elem.matches("\\d+(,\\d+)")){
                    b.add(elem);
                }
                }

//            int sum = 0;
//            for (String elem : b) {
//                String[] stringNumbers = elem.split(",") ;
//                sum += Integer.parseInt(stringNumbers[0]) * Integer.parseInt(stringNumbers[1]);
//            }







        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printArray(String[] arr) {
        for (String el : arr) {
            System.out.println(el);
        }
    }
}
