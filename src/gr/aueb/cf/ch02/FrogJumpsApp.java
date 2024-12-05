package gr.aueb.cf.ch02;

/**
 *
 */
public class FrogJumpsApp {

    public static void main(String[] args) {


        int target = 90;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start)/(double) hop);



        System.out.println(jumps);
    }
}
