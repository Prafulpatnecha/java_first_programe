import java.util.Scanner;

//Single inharitance

class A
{
    public int a=10;
    private int b=20;
    protected  int c = a+b;

}

abstract class C
{
    void idsp()
    {
        System.out.println("Hello");
    }
    abstract void upcomingFeature();
}

class D extends C
{
    @Override
    void upcomingFeature() {
       System.out.println("C to D");
    }
}
class B extends A
{
    void getAValues()
    {
        int value = c-a;
        System.out.println(a+" + "+ value +" = "+ c);

    }
}
public class inharitance_For_Java {
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        B b = new B();
        C c= new D();
        c.upcomingFeature();
        c.idsp();
        b.getAValues();
    }
}
