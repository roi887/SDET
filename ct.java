public class ct {
    int age;
    String name;
    float c;
    public ct(int age , String name){
       this.age =age;
       this.name = name;

    }
    public ct(float c){
        this.c =c;
    }

    public void action (){

        System.out.printf("hi %s your age is %d and your change is %f ",name, age, c);
    }

    public static void main(String[] args) {
        ct sc = new ct(47.0f);
        ct sc1 = new ct(34,"arun");
        sc1.action();
sc.action();


    }
}
