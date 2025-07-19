package Inheritacne;

public class manager implements Iadmin {


    public static void main(String[] args) {
        admin s = new admin();
        s.read();         s.write();
        s.manager();


    }


    @Override
    public void manager() {

    }

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}
