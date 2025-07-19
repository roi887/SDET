public class inboundExce {
    public static void main(String[] args) {


        int [][] i= new int[3][];

        i[0] = new int[2];
         i[1]= new int[4];

         i[2] = new int[]{ 3,4,5,6,7};

         i[0][0]= 67;
        i[0][1]= 45;

        i[1][0]= 67;
        i[1][1]= 45;
        i[1][2]= 67;
        i[1][3]= 90;


//        for ( int n =0; n<i.length; n++){
//
//             for ( int k=0; k<i[n].length; k++){
//
//                 System.out.print(i[n][k]+" " );
//
//             }
//
//            System.out.println();
//        }
         int sum =0;

         for ( int n =0; n<i.length; n++){

             sum+=i.length;

         }
        System.out.println(sum);


    }
}
