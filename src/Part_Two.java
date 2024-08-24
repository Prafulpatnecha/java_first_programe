import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    public static String college="Rnw";

    Student() {
        System.out.println("Par Class Will Run ");
    }
    public void setData(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void getData()
    {
        System.out.println("\nID : "+id+"\nName : "+name+"\nAge : "+age);
    }

}

public class Part_Two
{
    public static void main(String arg[])
    {
        Scanner sin =new Scanner(System.in);
        Student student=new Student();
        int id=5572;
        String name="Praful";
        int age=20;
        student.setData(id,name,age);
        student.getData();
        System.out.println(Student.college);
    }
}
//todo        int a=sin.nextInt();
//todo        int b=sin.nextInt();
//todo        int c= a+b;
