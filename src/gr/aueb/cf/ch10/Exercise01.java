package gr.aueb.cf.ch10;

public class Exercise01 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0 ; i < 6 ; i ++){
            for(int j = 1 ; j < 7 ; j++){
                for(int k = 2 ; k < 8 ; k++){
                    for(int l = 3 ; l < 9 ; l++){
                        for(int m = 4 ; m < 10; m++){
                            for (int n = 5 ; n < 11; n++){
                                System.out.printf("%d, %d, %d, %d, %d, %d" ,i,j,k,l,m,n);
                                System.out.println();
                                count ++;

                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
