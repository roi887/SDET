package com.Java;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
    int a,i,output;
    Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the table no:");
    a=scanner.nextInt();
        for(i=1;i<=10;i++)
    {
        output=a*i;
        System.out.printf("%dx%d=%d%n",a,i,output);
    }
    }}
