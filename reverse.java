package com.project12;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 ="arun";;

	        String temp = "";
	        for (int i = s1.length()-1; i >= 0; i--) {
	            temp = temp+ s1.charAt(i);  // appending character at the end
	        }

	        System.out.println("Reversed :" + temp);

	}

}
