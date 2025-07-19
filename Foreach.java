import java.util.Arrays;

public class Foreach {

    public static void main(String[] args) {

        int[][] i = new int[3][2];

        i[0][0]= 1;
        i[0][1] =2;

        i[1][0] =3;

        i[1][1] =4;

        i[2][0] =5;

        i[2][1] =6;

//for ( int[] arr: i){
//    for ( int b :arr){
//
//        System.out.printf("%-2d", b);
//    }
//    System.out.println();
//        }

         for( int n = 0; n <i.length; n++){

             int[] r= i[n];

             for (int j =0; j<r.length; j++){

                 System.out.printf(r[j]+"   ");
             }
             System.out.println();
         }

      int     sum =0;

        for( int n = 0; n <i.length; n++){

            sum += i[n].length;
        }
        System.out.println();
        System.out.println("the sum of array is " +sum);
}}
