package gr.aueb.cf.excercises;

public class MinTimeRiver {

    public static void main(String[] args) {

        int[] T = {1,1,2,2,4,1,2,1,4,3};
        System.out.println(getMinTime(4,T));

    }

    public static int getMinTime(int y, int[] arr) {
        int[] helperArray = new int[y+1];
        int remainingSteps = y;
        int time = -1;

        for (int i = 0 ; i < arr.length ; i++) {
            if(helperArray[arr[i]] == 0){
                helperArray[arr[i]] = 1;
                remainingSteps --;
            }else continue;

            if (remainingSteps == 0) {
                time = i;
                break;
            }
        }
        return time;
    }
}
