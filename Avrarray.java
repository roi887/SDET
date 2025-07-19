public class Avrarray {

    public static void main(String[] args) {
         int i[] = { 23, 56, 788, 54, 34};


         int sum =0;

          for ( int n=0; n<i.length;){

              sum+= i[n];
              n++;
          }
        System.out.println(" sum is " + sum);

           double avg = (double) sum/i.length;

        System.out.println(avg);




    }
}
