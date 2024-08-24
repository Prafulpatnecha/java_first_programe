import java.util.Scanner;

//Single inharitance

class A
{
    public int a=10;
    private int b=20;
    protected  int c = 10+20;

}
class B extends A{
    void getAValues()
    {
        int value = c-a;
        System.out.println(a+" + "+ value +" = "+ c);
    }
}


public class inharitance_For_Java {
    public static void main(String args[])
    {
        Scanner sin= new Scanner(System.in);
        B b = new B();
        b.getAValues();
    }
}
