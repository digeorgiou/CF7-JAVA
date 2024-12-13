package gr.aueb.cf.ch10;

public class getArray {

    public static void main(String[] args) {

        getArrayOfInteger(1214);

    }

    public static int[] getArrayOfInteger(int bigInt) {
        int count = 1;
        int backUp = bigInt;

        while((bigInt / 10) != 0) {
            count ++;
            bigInt = bigInt/10;
        }

        int[] arr = new int[count];

        for(int i = count-1 ; i >=0 ; i--){
            arr[i] = (backUp % 10);
            backUp = backUp/10;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
