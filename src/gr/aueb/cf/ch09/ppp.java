package gr.aueb.cf.ch09;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ppp {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int num1;
            int num2;
            int sum;

            while(true){
                try {
                    num1 = getOneNum();

                    System.out.println(isArmstrong(num1));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }


        }

        public static boolean isInt(String s){
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }

        public static int getOneNum() throws Exception {
            String numStr;
            int num;
            try {
                System.out.println("Please enter an int or # for exit.");
                numStr = sc.nextLine();
                if(numStr.equals("#")) throw new Exception("User Exit");
                while(!isInt(numStr)){
                    System.out.println("Error. Please enter a valid integer");
                    numStr = sc.nextLine();
                    if(numStr.equals("#")) throw new Exception("User Exit");
                }
                num = Integer.parseInt(numStr);
                return num;
            } catch (Exception e) {
                System.err.println("User exits");
                throw e;
            }

        }

        public static int add(int a, int b) {
            return a+b;
        }

        public static int countDigits(int number){
            int count = 0;
            int temp = number;
            while(temp != 0){
                count ++;
                temp = temp/10;
            }
            return count;
        }

        public static boolean isArmstrong(int number) {
            int n = countDigits(number);
            int temp = number;
            int digit;
            int sum = 0;

            for (int i = 0 ; i < n ; i++){
                digit = temp%10;
                System.out.println(i + "loop");
                System.out.println(digit);
                sum += Math.pow(digit, n);
                System.out.println(sum);
                temp = temp/10;
                System.out.println(temp);
            }
            return sum == number;
        }
}
