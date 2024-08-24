import java.util.Scanner;


interface Auth{
    void login();
    void logout();
}
interface Theme{
    void dark();
    void light();
}

class Validation implements Theme,Auth
{
    String value = "Hello Java Come in flutter Grow";
    @Override
    public void login() {
        System.out.println("Login");
        System.out.println(value);
    }

    @Override
    public void logout() {
        System.out.println("logout");
    }

    @Override
    public void light() {
        System.out.println("light");

    }

    @Override
    public void dark() {
        System.out.println("dark");
    }
}

public class interfaceInharitance
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Validation validation=new Validation();
        validation.dark();
        validation.light();
        validation.login();
        validation.logout();
        System.out.println();
    }
}
