package Encapsulation;

public class Student {

  private int roll;

    public void setName(String name) {
        this.name = name;

    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setAttended(boolean isAttended)
    {

        if(!isAttended)

            System.out.println("status updated");


    }

    private String name ;



    private boolean isAttended;


    public String getName() {

        return name;
    }

    public int getRoll() {
        return roll;
    }

    public boolean getIsAttended()
    {

        return isAttended;
    }

    public Student(int roll, String name, boolean isAttended) {
        this.roll = roll;
        this.name = name;
        this.isAttended = isAttended;


    }


    }






