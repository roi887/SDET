package Pojoo;

public class program1 {

    public static void main(String[] args) {

        Employeepojo e1 = new Employeepojo();

        e1.setName("Arun");
        e1.setSalary(305000);
        e1.setId(455);

        Employeepojo e2 = new Employeepojo();

        e2.setName("jadav");
        e2.setSalary(3007000);
        e2.setId(455);

        Employeepojo e3 = new Employeepojo();

        e3.setName("kumar");
        e3.setSalary(300600);
        e3.setId(455);

        Employeepojo[] em = new Employeepojo[]{e1, e2, e3};
        for (Employeepojo emp : em)
            System.out.println((emp));


//        System.out.println(e1.getId());
//        System.out.println(e1.getName());
//        System.out.println(e1.getSalary());
    }
}

