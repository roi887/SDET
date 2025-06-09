package com.automate;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Palindrome {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       int a =sc.nextInt();
        int b = reverse(a);
if (a==reverse(b)){
            System.out.println("palindrom");

        }else{

            System.out.println("not an palindrom ");
        }

    }

}
