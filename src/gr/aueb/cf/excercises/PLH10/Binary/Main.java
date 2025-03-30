package gr.aueb.cf.excercises.PLH10.Binary;

public class Main {

    public static void main(String[] args) {

        ConverterBinary cb = new ConverterBinary();
        long sum = 0;
        for (int i = 0 ; i < 26 ; i++){
            sum += Math.pow(2,i);
            System.out.println(sum);
        }

        long n = 494392240  ;
        System.out.println(sum + n);
    }
}
