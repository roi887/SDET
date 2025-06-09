package com.lab12x;

import java.util.Scanner;


public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reverse += input.charAt(i);

        }
        if (reverse.equals(input)) {
            System.out.println("palindrome");

        } else {
            System.out.println(" its not an palindrome");
        }
    }
}
