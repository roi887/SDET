package src;
class raavan{
    void eat(){

        System.out.println("where are you ");
    }}
class jeevan extends raavan {

    void bark(){

        System.out.println("i am here");
    }
}

public class inheritence {


    public static void main(String[] args) {


 jeevan sc = new jeevan();

 sc.bark();
 sc.eat();


    }
}
