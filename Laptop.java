package Interface;

public interface Laptop {

       void cut();
       void paste();
       void copy();
       void keyboard();

       default void security(){

              System.out.println("please code ");
       }

       static void audio(){

              System.out.println("audio code");
       }





}
