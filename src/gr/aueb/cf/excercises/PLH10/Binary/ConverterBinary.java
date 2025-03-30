package gr.aueb.cf.excercises.PLH10.Binary;

import java.util.ArrayList;

public class ConverterBinary {

    public String convertDecimalIntegerToBin(int number) {

        int result = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(number != 0){
            digits.add(number%2);
            number /= 2;
        }

        for(int i = digits.size() - 1 ; i >= 0 ; i--){
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    public String convertDecimalSubOneToBin(double number,
                                               int decimalDigits) {
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < decimalDigits; i++) {
            number *= 2;
            digits.add((int) number / 1);
            sb.append((int) number / 1);
            if (number > 1) {
                number --;
            }
        }

        return sb.toString();
    }

    public String convertDecimalToBin(double d , int digits){

        String left = convertDecimalIntegerToBin((int) d/1);
        String right = convertDecimalSubOneToBin(d%1 , digits);
        return left + "." + right;
    }


    public double convertBinToDec(String d){

        int count = 0;
        double result = 0.0;
        double temp = Double.parseDouble(d.substring(count,count+1));

        while(temp % 1 > 0.0001){
            temp *= 10;
            count -= 1;
        }
        int intTemp = (int) temp;

        while (intTemp != 0) {
            result += intTemp%10 * Math.pow(2,count);

            intTemp /= 10;
            count += 1;
        }
        return result;

    }

    public double convertOctToDec(double d){

        double result = 0.0;
        double temp = d;
        int count = 0;

        while(temp % 1 > 0.0001){
            temp *= 10;
            count -= 1;
        }
        int intTemp = (int) temp;

        while (intTemp != 0) {
            result += intTemp%10 * Math.pow(8,count);

            intTemp /= 10;
            count += 1;
        }
        return result;


    }

    public String convertDecimalIntegerToOct(int number) {

        int result = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(number != 0){
            digits.add(number%8);
            number /= 8;
        }

        for(int i = digits.size() - 1 ; i >= 0 ; i--){
            sb.append(digits.get(i));
        }
        return sb.toString();
    }


    public String convertDecimalSubOneToOct(double number,int decimalDigits) {
        ArrayList<Integer> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < decimalDigits; i++) {
            number *= 8;
            digits.add((int) number / 1);
            sb.append((int) number / 1);
            if (number > 1) {
                number -= (int) number / 1;
            }
        }

        return sb.toString();
    }

    public String convertDecToOct(double d , int digits){

        if(digits == 0) return convertDecimalIntegerToOct((int)d).toString();
        String left = convertDecimalIntegerToOct((int) d/1);
        String right = convertDecimalSubOneToOct(d%1 , digits);
        return left + "." + right;
//
    }

}
