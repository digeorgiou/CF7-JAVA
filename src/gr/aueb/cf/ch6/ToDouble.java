//package gr.aueb.cf.ch6;
//
//public class ToDouble {
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 3, 4};
//        int[] toDouble;
//
//        toDouble = mapToDouble(arr1);
//        System.out.println(arr1);
//
//    }
//
//
//    public static int[] mapToDouble(int[] arr) {
//
//        int[] arrCopy = new int[arr.length];
//        for (int el : arrCopy) {
//            el = el * 2;
//        }
//        return arrCopy;
//
//    }
//
//    public static int sum(int[]arr) {
//        int sum = 0;
//        for (int el : arr){
//            sum += el;
//        }
//        return sum;
//    }
//
//    public static double avg(int[] arr) {
//        double avg;
//        return (sum(arr)/(double)arr.length);
//    }
//
//    public static boolean anyEven (int[] arr) {
//        for (int elem : arr) {
//            if (elem % 2 == 0) {
//                return true;
//            }
//            return false;
//        }
//    }
//
//    public static boolean hasThreeConsecutive (int[] arr) {
//        boolean hasThreeConsecutive = false;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] == arr[i - 1] + 1  && arr[i] == arr[i+1] -1)
//                hasThreeConsecutive = true;
//            }
//
//
//        return hasThreeConsecutive;
//    }
//}
