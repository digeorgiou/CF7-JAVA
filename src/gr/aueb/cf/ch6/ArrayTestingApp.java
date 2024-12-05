//package gr.aueb.cf.ch6;
//
//import java.util.Random;
//
//public class ArrayTestingApp {
//
//    public static void main(String[] args) {
//
//        int[] myArray = randomizeArrayTen();
//
//        printArray(myArray);
//        System.out.println();
//        printArray(myArray, 3, 6);
//        System.out.println();
//        System.out.println(findPosition(myArray, 24));
//
//        int[] myArray2 = new int[] {1,2,4,7,8,4,9,10,4,};
//        printArray(myArray2);
//        System.out.println();
//        replaceAll(myArray2,4, 20);
//        printArray(myArray2);
//        System.out.println();
//        replace(myArray2, 20,12);
//        printArray(myArray2);
//    }
//
//    public static void printArray(int[] arr){
//        for (int elem : arr){
//            System.out.print(elem + " ");
//        }
//    }
//
//    public static void printArray(int[] arr, int start, int end) {
//        for (int i = start ; i <= end ; i++)
//            System.out.print(arr[i] + " ");
//    }
//
//    public static int[] randomizeArrayTen(){
//        int[] myArray = new int[10];
//
//        for (int i = 0 ; i < 10 ; i++){
//            Random r = new Random();
//            myArray[i] = r.nextInt(101);
//        }
//        return myArray;
//
//    }
//
//    public static int findPosition(int[] arr, int a){
//        for ( int i = 0; i < arr.length ; i++){
//            if (arr[i] == a){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void replaceAll(int[] arr, int oldValue, int newValue){
//        while (findPosition(arr,oldValue) >= 0){
//            arr[findPosition(arr,oldValue)] = newValue;
//        }
//    }
//
//    public static void replace(int[] arr, int oldVal, int newVal) {
//        int positionToUpdate;
//
//        positionToUpdate = findPosition(arr, oldVal);
//
//        if (positionToUpdate == -1) {
//            return;
//            //επειδη εδω υπαρχει το return, δεν χρειαζεται να βαλω
//            //else στο απο κατω. αλλιως θα επρεπε να βαλω
//            // για να μην εκτελουνται και τα δυο
//        }
//
//        arr[positionToUpdate] = newVal;
//    }
//}
