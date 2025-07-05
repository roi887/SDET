package com.automate;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {


        String s1 ="arun";;

        String reversed = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            reversed = reversed+(s1.charAt(i));  // appending character at the end
        }

        System.out.println("Reversed: " + reversed);







    }
}
