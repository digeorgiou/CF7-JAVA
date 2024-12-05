package gr.aueb.cf.ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String line;
        String[] tokens;
        int[] arrayLeft = new int[1000];
        int[] arrayRight = new int[1000];

        File inputFile = new File("C:/Users/digeo/Documents/inputCodes.txt");
        try (Scanner in = new Scanner(inputFile)){

            for (int i = 0 ; i < 1000 ; i++){
                line = in.nextLine();
                tokens = line.split("\\s+");
                arrayLeft[i] = Integer.parseInt(tokens[0]);
                arrayRight[i] = Integer.parseInt(tokens[1]);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int[] sortedLeft = bubbleSort(arrayLeft);
        int[] sortedRight = bubbleSort(arrayRight);


        int solution = 0;
        int similarity = 0;

        for (int i = 0 ; i < 1000 ; i++) {
            solution += Math.abs(sortedLeft[i] - sortedRight[i]);

            similarity += sortedLeft[i] * countNumber(sortedRight, sortedLeft[i]);
        }

        System.out.println(similarity);

    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int countNumber(int[] arr, int number){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i]== number){
                count ++;
            }
        }
        return count;
    }

}

