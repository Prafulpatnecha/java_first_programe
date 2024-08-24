import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

interface Crud{
    void create(String id, String name,String std);
    void read();
    void update();
    void delete();
    void handle();
    void readAll();
}

class Students implements Crud{
    Scanner scanners = new Scanner(System.in);

    ArrayList<HashMap<String,String>> student = new ArrayList<>();

    @Override
    public void create(String id,String name, String std) {
    HashMap<String,String> studentName = new HashMap<>();
    studentName.put("id",id);
    studentName.put("name",name);
    studentName.put("std",std);
    student.add(studentName);
        handle();
    }

    @Override
    public void read() {
        Scanner scanner= new Scanner(System.in);
        int value = student.size()-1;
        System.out.print("Enter 0 to "+value+" Number");
        int number = scanner.nextInt();
        System.out.println(student.get(number));
        handle();
    }

    @Override
    public void readAll() {
        System.out.println(student);
        handle();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
        int index=0;
        boolean boolValue =false ;
        int value = scanners.nextInt();
        for(int i=0; i<student.size();i++)
        {
            if(student.get(i).get("id")==String.valueOf(value))
            {
                index=i;
                boolValue=true;
            }
        }
        if(boolValue)
        {
            student.remove(index);
        }
        handle();
    }

    @Override
    public void handle() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Create List Enter 1");
        System.out.println("Read List Enter 2");
        System.out.println("Update List Enter 3");
        System.out.println("Read All Data List Enter 4 ");
        System.out.print("Delete List Enter 5 : ");
        int value = scanner.nextInt();
        if(value==1)
        {
//            System.out.print("Enter The Id : ");
            String id = String.valueOf(student.size());
            System.out.print("Enter The Name : ");
            String name = scanner.next();
            System.out.print("Enter The Standard : ");
            String standard = scanner.next();
            create(id,name,standard);
        }
        else if(value==2) {
            read();
        } else if (value==3) {
            update();
        } else if (value==4) {
            readAll();
        } else if (value==5) {
            delete();
        } else {
            handle();
        }
    }
}


public class crud_Operation {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        students.handle();
    }
}
