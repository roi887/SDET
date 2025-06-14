package src;

public class Multiple {
    public static void main(String[] args) {

//         int i;
//          for ( i=0; i<=20; i++){
//
//              System.out.println("hello world");
//          }


        int i;

        for ( i=1; ;){
            if(i<10){
                System.out.println(i);
                i*=2;
            }else
                break;

        }
        System.out.println(i);
    }
}
