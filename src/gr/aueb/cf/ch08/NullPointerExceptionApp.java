package gr.aueb.cf.ch08;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = "Athens";

        if (s != null && s.equals("Athens")) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }
    }
}
