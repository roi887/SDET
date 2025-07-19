package methods;

public class static1 {

    static int a =56;// static varibales

   static String name ="Arun";//static varibales


    public static void action(){// static method

        static1 sc = new static1();

        sc.raavn();// calling non-static in static with oj=object

        System.out.println("hai ");
    }


    void raavn(){// non-static method


        System.out.println(a);
        System.out.println("bye");

    }

    void jeevan(){

        action();
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(name);

        static1 sc2 = new static1();
        sc2.raavn();
        sc2.jeevan();

    }

}
