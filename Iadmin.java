package com.labs.inheritance;

public interface Iadmin  extends Idev,Iuser{

    void manage();
    void write();
    void read();

}
