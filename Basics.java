package com.Java;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		
// this code will tell whether the person is eligible to vote or not 
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
System.out.println("Enter your Name :" );
String address ;

String name = sc.next();
System.out.println("Enter your age :" );
int age = sc.nextInt();
 
if (age<=18) {
	System.out.println("your are not eligible to vote");
}else {
	
	System.out.println("your eligible to vote");
	
}
System.out.println("Enter your pole address: ");

address =sc.next();

String a ="Anekal";

 if (address == a) {
	 
	 System.out.println("Your voting room no is 45");
	 
 }else {
	 
	 System.out.println("Sorry ...  visit office staff");
 }
	}
	      
}
