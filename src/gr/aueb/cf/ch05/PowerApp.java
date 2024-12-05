package gr.aueb.cf.ch05;

public class PowerApp {

    public static void main(String[] args) {

        long a;
        long b;

        System.out.println(power(2,3));
    }

    public static long pow (long a, long n) {
//        long result = 1;
//        for (int i = 1; i <= n ; i++ )
//            result *= a;
//        return result
        return (long) Math.pow(a, n);
    }

    public static int power(int a, int n){
        if (n == 0)
            return 1;
        else
            return power(a,n-1)*a;

        //η και με τριαδικο
        //return (n == 0) ? 1 : power (a, n-1) * a;

    }
}
