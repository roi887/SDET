package src;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:=");

        long num=sc.nextInt();
        int fact = 1;

        for (int j = 1; j <= num; j++) {
            fact *= j;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}