package gr.aueb.cf.excercises.ArrayTest;

import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    int number;
    int[] arr;
    int[][] arrTwoD;
    Random r = new Random();

    MyArrays(int n) {
        number = n;
        arr = new int[n];
        for (int i = 0; i < number; i++) {
            arr[i] = r.nextInt(101);
        }

    }

    MyArrays(int x, int y){
        arrTwoD = new int[x][y];

        for (int i = 0; i < x ; i++){
            for (int j = 0; j < y ; j++)
                arrTwoD[i][j] = r.nextInt(101);
        }
    }


    public void printArray() {
        for (var elem : this.arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public void printArrayTwoD() {
        for (int i = 0 ; i < this.arrTwoD.length; i ++){
            System.out.println("-----------------------------");
            for (int j = 0 ; j < this.arrTwoD[i].length ; j ++ ){
                System.out.printf("%02d ",arrTwoD[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

    }
    public void printArray(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printArray(int[] myArr){
        for(var elem : myArr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public int findMin() {
        int minValue = 101;
        for (int elem : arr) {
            minValue = (elem < minValue) ? elem : minValue;
        }
        return minValue;
    }

    public int findMax() {
        int maxValue = 0;
        for (int elem : arr) {
            maxValue = (elem > maxValue) ? elem : maxValue;
        }
        return maxValue;
    }

    public int findMinPosition() {
        int minValue = 101;
        int minPosition = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minPosition = i;
            }else
                continue;
        }
        return minPosition + 1 ;
    }


    public int findMaxPosition() {
        int maxValue = 0;
        int maxPosition = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxPosition = i;
            }else
                continue;
        }
        return maxPosition + 1 ;
    }

    public boolean containsElement (int el) {
        for (int elem : arr){
            if ( elem == el) {
                return true;
            }
        }
        return false;
    }

    public int findElementPosition (int el) {
        int position = 0;
        if (!this.containsElement(el)){
            return -1;
        }
        else {
            for (int i = 0 ; i < arr.length ; i ++){
                if (arr[i] == el) {
                    position = i;
                    break;
                }
            }
        }
        return position;
    }

    public void replaceElement (int oldValue , int newValue){
        while (this.containsElement(oldValue)){
            arr[this.findElementPosition(oldValue)] = newValue;
        }
    }

    public int[] deepCopy() {
        int[] arrayCopy = Arrays.copyOf(arr,arr.length);
        return arrayCopy;
    }

    public int[] deepCoppy(int start, int end){
        int[] arrayCopy = Arrays.copyOfRange(arr, start, end);
        return arrayCopy;
    }

    public int[] distibutions() {
        int[] distribution = new int[10];
        for (int value : arr){
            if (value == 100){
                distribution[9] += 1;
            }else {
                distribution[value/10] += 1;
            }
        }
        return distribution;
    }

    public void printDistribution() {
        for (int i = 0 ; i < this.distibutions().length ; i++){
            System.out.printf("%02d - %02d : ", i * 10 , (i != 9) ? (i*10 + 9) : (i*10 + 10));
            for (int j = 0 ; j < this.distibutions()[i] ; j++)
                System.out.print("*");
            System.out.println();
        }
    }











}