package com.project12;

import java.util.Scanner;

public class fixzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:=");
		
		String s = sc.nextLine();
		
		String reverse ="";
		
		for ( int i = s.length()-1; i>=0; i--) {
			
			reverse = reverse + s.charAt(i);
		}
		
		System.out.println(reverse);
		

	}

}
