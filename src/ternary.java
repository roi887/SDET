import java.util.Scanner;

public class ternary

{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no: = ");
    int num = sc.nextInt();
    String resultout = (num % 2 == 0) ? "Even" : "Odd";
System.out.println(num + " is " + resultout);
}}