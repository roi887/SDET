import java.util.Scanner;

public class leapyear {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the year:=");
        int input =sc.nextInt();

        if (( input %4==0 && input%100!=0) || ( input%400 ==0)){
            System.out.println(" leap year");

        }else{
            System.out.println("not an leap year");
        }


    }
}
