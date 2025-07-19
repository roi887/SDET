package com.juneM;

import java.util.concurrent.Callable;

public class ConstrucVra {

    int a ;

    public ConstrucVra(int a){

        this.a=a;

    }
    void action(){

        System.out.println(a);
    }

    public static void main(String[] args) {


        ConstrucVra sc = new ConstrucVra(23);

        sc.action();




    }
}
