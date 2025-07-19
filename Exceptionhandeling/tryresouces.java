package Exceptionhandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class tryresouces {
    public static void main(String[] args)  throws Exception{

       File f = new File("./test.txt");


        try(  Scanner sc = new Scanner(f);
              FileInputStream fc = new FileInputStream(f);){


            int asci ;

            while((asci=fc.read())!=-1) {
                System.out.print((char)asci);

            }
            System.out.println();
            int a =4;
            int b =0;

            int sum =0;

            sum=a/b;
            System.out.println(sum);

            int[] arr = {1,2,3};

            System.out.println(arr[3]);
            System.exit(0);
        }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
            System.out.println("command output ");

    }

        finally {
            System.out.println("bai");
        }


    }}
