package gr.aueb.cf.ch06;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {6, 3, 7, 4, 4, 6, 7, 9, 3, 45, 1, 67, 7};


        for(int i = 1 ; i < arr.length ; i++){
            int j = i;
            boolean check = false;
            while(j >= 1 && check == false){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    for (int elem : arr){
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }else {
                    check = true;
                    System.out.println("check = true");
                }

                j -= 1;
            }
        }

//        for (int elem : arr){
//            System.out.print(elem + " ");
//        }
    }
}
