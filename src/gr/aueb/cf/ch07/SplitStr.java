package gr.aueb.cf.ch07;

public class SplitStr {

    public static void main(String[] args) {
        String s = "Athens Uni    of Econ   and Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
