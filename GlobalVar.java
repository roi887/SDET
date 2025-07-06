package com.juneM;

public class GlobalVar {

    int a ;
    String name ;

     void student(){
      a=67;
      name ="jeevan";
         System.out.println(a+name);

    }
    public static void main(String[] args) {

GlobalVar sc = new GlobalVar();
sc.student();
sc.student2();

    }

    void student2(){

        a=56;
        System.out.println(a);

    }
}
