package Inheritacne;

public class all {

   public  static class animal{

        void action(){

            System.out.println("raavn");
        }
    }

   public static class  dog extends  animal{

        void action(){

            System.out.println("jeevan");
        }
         void action3(){
            super.action();
            action();

         }


        }
    public static void main(String[] args) {
        dog c= new dog();
        c.action();
        c.action3();

    }




}
