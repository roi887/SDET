package Interface;

public class User {
    public static void main(String[] args) {
        Lenovo sc = new Lenovo();

        sc.paste();
        sc.keyboard();
        sc.cut();
        sc.copy();
        sc.security();
        HP s = new HP();
        s.camera();
        s.security();
        Laptop.audio();
    }
}
