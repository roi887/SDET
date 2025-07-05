package Interface;

public class Lenovo implements Laptop {


    @Override
    public void cut() {
        System.out.println("lenovo cut code");
    }

    @Override
    public void paste() {
        System.out.println("lenovo paste code");
    }


    @Override
    public void copy() {
        System.out.println("lenovo copy code");
    }

    @Override
    public void keyboard() {
        System.out.println("lenovo keyboard code");
    }

    @Override
    public void security(){

        System.out.println("sec code");
    }
}
