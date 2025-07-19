package com.labs.inheritance;

public class admin extends dev{

    void manage(){
      super.read();
      write();


        System.out.println("manage code ");

    }
    void read(){
        System.out.println("admin read code");
    }

}
