package Accessmodifies_public;

public class Privt {

public Privt(){

    int f = 45;
}
    public void method (){

        System.out.println("byee");
    }


    private void methdo1(){

        method();
    }

    public static void main(String[] args) {

        new Privt().methdo1();
    }
}

