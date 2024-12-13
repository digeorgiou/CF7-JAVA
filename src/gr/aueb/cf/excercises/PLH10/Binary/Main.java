package gr.aueb.cf.excercises.PLH10.Binary;

public class Main {

    public static void main(String[] args) {

        ConverterBinary cb = new ConverterBinary();

//        String d =cb.convertDecToOct(61,0);
//        System.out.println(d);

        double c = cb.convertOctToDec(373);
        System.out.println(c);

        double d = cb.convertOctToDec(4001.12);
        System.out.println(d);

        String s = cb.convertDecToOct(155,0);
        System.out.println(s);

        String s2 = cb.convertDecToOct(17.16,2);
        System.out.println(s2);
    }
}
