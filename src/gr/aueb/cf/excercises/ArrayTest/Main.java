package gr.aueb.cf.excercises.ArrayTest;

public class Main {

    public static void main(String[] args) {


    int[] arr1 = new int[] {1, 0 , 0 , 1, 1, 0 , 0};

        printArrayMethod(arr1);
        printArrayMethod(ComplimentByOne(arr1));

    }
        public static int findMinPositionMethod ( int[] arr, int start, int end){
            int minValue = 101;
            int minPosition = 0;
            for (int i = start; i < end; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minPosition = i;
                } else
                    continue;
            }
            return minPosition;
        }




    public static int getMaxPosition (int[] arr , int low , int high){
        int maxPosition = 0;
        int maxValue = 0;
        for (int i = low ; i < high ; i++ ){
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static void printArrayMethod(int[] arr) {
        for (var elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void printArrayTwoDMethod(int[][] arr) {
        for (int i = 0 ; i < arr.length; i ++){
            System.out.println("-----------------------------");
            for (int j = 0 ; j < arr[i].length ; j ++ ){
                System.out.printf("%02d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

    }

    public static void swapPositions(int[] arr, int a, int b) {
        if (a >= arr.length || b >= arr.length)
            System.out.println("Wrong a,b input");
        else {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swapPositions(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = findMinPositionMethod(arr, i, arr.length);
            swapPositions(arr, i, min);
        }
        return arr;

    }

    public static int[] merge(int[] left, int[] right) {

        int j = 0;
        int k = 0;
        int[] merged = new int[left.length + right.length];

        while (j + k < merged.length) {
            if (j == left.length) {
                merged[j + k] = right[k];
                k++;
            } else if (k == right.length) {
                merged[j + k] = left[j];
                j++;
            } else if (left[j] <= right[k]) {
                merged[j + k] = left[j];
                j++;
            } else {
                merged[j + k] = right[k];
                k++;
            }
        }
        return merged;


    }
    public static int[] mergeSort(int[] arr, int start, int end){
        if (end - start <= 0){
            return new int[] {arr[end]};
        }
        int middle = (end + start)/2;
        int[] left = mergeSort(arr , start , middle);
        int[] right = mergeSort(arr,middle + 1, end);

        return (merge(left,right));

    }

    public static int findElement(int[] arr, int x){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static int findElement (int[] arr ,int start, int end, int x){
        int middle =  0 ;

        if (arr == null) return -1;
        if ((start < 0) ||(end > arr.length)) return -1;
        if (end < start) return -1;

        middle = (start + end)/2;


        if (x==arr[middle]){
            return middle;
        }
        if (x > arr[middle]){
            return findElement(arr, middle+1, end, x);
        }
        else {
            return findElement(arr,start,middle-1,x);
        }
    }

    public static boolean isArraySymmetric (int[] arr) {
        for (int i=0 , j = arr.length-1 ; j>i ; i++,j--){
            if (arr[i] != arr[j]){
                return false;
            }
        }
        return true;
    }

    public static int[] filterEvens(int[] arr){
        int evensCount = 0;

        for (int elem : arr){
            if (elem % 2 == 0){
                evensCount +=1;
            }
        }

        int[] evensArray = new int[evensCount];

        for (int i = 0, j = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 == 0){
                evensArray[j] = arr[i];
                j++;
            }
        }
        return evensArray;

    }

    public static int[] filterOdds(int[] arr){
        int oddsCount = 0;

        for (int elem : arr){
            if (elem % 2 != 0){
                oddsCount +=1;
            }
        }

        int[] oddsArray = new int[oddsCount];

        for (int i = 0, j = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 != 0){
                oddsArray[j] = arr[i];
                j++;
            }
        }
        return oddsArray;

    }

    public static int[] getNumbersBiggerThan (int[] arr, int value){

        int cnt = 0;
        for (int i = 0 ; i < arr.length ; i++ ){
            if (arr[i] >= value){
                cnt += 1;
            }
        }
        int[] biggerArray = new int[cnt];

        for (int i = 0, j =0 ; i < arr.length ; i++ ){
            if (arr[i] >= value){
                biggerArray[j] = arr[i];
                j++;
            }
        }
        return biggerArray;
    }

    public static boolean hasMoreThanThreeEvens (int[] arr){
        return (filterEvens(arr)).length > 3;
    }

    public static boolean hasMoreThanThreeOdds (int[] arr){
        return (filterOdds(arr)).length > 3;
    }

    public static boolean hasMoreThanThreeConsec(int[] arr){
        boolean consec = false;
        for (int i = 0 ; i < arr.length - 2 ; i ++){
            if ((arr[i] == arr[i+1]-1) && (arr[i] == arr[i+2]-2)){
                consec = true;
            }
        }
        return consec;
    }

    public static boolean hasMoreThanThreeSameEnding(int[] arr){
        int[] endings = new int[10];

        for (int i = 0 ; i < arr.length ; i++) {
            endings[arr[i]%10] += 1;
        }
        for (int i : endings){
            if (i>3){
                return true;
            }
        }
        return false;
    }

    public static boolean hasThreeInSameDecade(int[] arr){
        int[] dividedBy10 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            dividedBy10[i] = arr[i]/10;
        }
        return hasMoreThanThreeSameEnding(dividedBy10);
    }

    public static int findSecondSmallestValue(int[] arr){
        int[] sortedArr = selectionSort(arr);
        int i = 1;
        while (sortedArr[i] == sortedArr[0]){
            i++;
            if (i == sortedArr.length){
                break;
            }
        }
        return sortedArr[i];
    }

    public static void printEvens(int[] arr) {
        for (int el : arr){
            if (el % 2 == 0){
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    public static int[] doubleArray(int[] arr){
        int [] arrDouble = new int[arr.length];
        for (int i = 0 ; i < arrDouble.length ; i++ ){
            arrDouble[i] = 2 * arr[i];
        }
        return arrDouble;
    }

    public static boolean isTherePositive (int[] arr){
        for (int el : arr){
            if (el > 0) return true;
        }
        return false;
    }

    public static boolean isAllPositive (int[] arr){
        for (int el : arr){
            if (el <= 0) return false;
        }
        return true;
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int startPosition = findElement(arr,key);
        int endPosition = findElement(arr, key);

        while ((endPosition < arr.length) && (arr[endPosition] == key)){
            endPosition++;
        }
        return new int[]{startPosition, endPosition-1};

    }

    /* Hint. Με βάση τον αρχικό πίνακα, δημιουργήστε ένα δυσδιάστατο
    πίνακα που σε κάθε γραμμή θα περιέχει δύο πεδία int.
    Στο πρώτο πεδίο θα εισάγεται η ώρα άφιξης ή αναχώρησης
     από τον αρχικό πίνακα και στο 2ο πεδίο θα εισάγεται ο αριθμός 1
     αν πρόκειται για άφιξη και 0 αν πρόκειται για αναχώρηση.
     */

    public static int[][] returnNew2dTable(int[][] arr2d) {
        int[][] newTable = new int[2*arr2d.length][2];
        for (int i = 0 ; i < arr2d.length ; i ++ ){
            for (int j = 0 ; j < 2 ; j++){
                newTable[i][0] = arr2d[i][j];
                newTable[i][1] = j;
            }
        }
        return newTable;

    }

    public static int[] doCircularRightShiftBy (int[] arr, int step){
        if (arr == null) return null;
        if (step < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++){
            rotated[(i + step) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] doCircularLeftShiftBy (int[] arr, int step){
        if (arr == null) return null;
        if (step < 0) return null;
        int[] rotated = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            rotated[i] = arr[(i+step) % arr.length];
        }

        return rotated;
    }

    public static int[] addOne(int[] arr){
        int[] arrAdded = new int[arr.length + 1];
        int currentSum;
        int carry= 1;


        for(int i = arr.length - 1 ; i >= 0 ; i --){
            currentSum = arr[i] + carry;
            arrAdded[i+1] = currentSum%10;
            carry = currentSum/10;
        }

        if (carry == 1){
            arrAdded[0] = 1;
        }else
            arrAdded[0] = 0;
        return arrAdded;
    }

    public static int[] addTwoInts ( int[] arr1, int[] arr2){
        int[] arrAdded;
        if (arr1.length >= arr2.length){
            arrAdded = new int[arr1.length + 1];
        } else {
            arrAdded = new int[arr2.length + 1];
        }

        int currentSum;
        int carry= 0;


        for(int i = arrAdded.length - 2 ; i >= 0 ; i --){
            currentSum = arr1[i] + arr2[i] + carry;
            arrAdded[i+1] = currentSum%10;
            carry = currentSum/10;
        }

        if (carry == 1){
            arrAdded[0] = 1;
        }else
            arrAdded[0] = 0;
        return arrAdded;

    }

    public static int power (int a , int n){
        int pwr = 1;
        for (int i = 1 ; i <= n ; i++){
            pwr *= a;
        }
        return pwr;
    }

    public static int binaryToDecimal (int[] arr) {
        int sum = 0;

        for ( int i = arr.length - 1 ; i >= 0 ; i --) {

            sum += arr[i]*power(2,arr.length - 1 - i);

        }
        return sum;
    }

    //ειναι ο bitwise operator XOR

    public static boolean XOR ( boolean b1 , boolean b2){
        return (b1 && !b2) || (b2 && !b1);
    }

    // ειναι ο bitwise operator ~

    public static int[] ComplimentByOne (int[] vector) {
        int[] newBin = new int[vector.length];
        for (int i = 0; i < newBin.length ; i++){
            newBin[i] = (vector[i] == 0) ? 1 : 0;
        }
        return newBin;
    }




}


