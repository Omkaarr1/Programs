package school;

/* PERSON CLASS */
import java.util.*;
public class Person 
{
    String Name;
    char Gender;
    int Age;
    Scanner in = new Scanner(System.in);

    Person()
    {
        Name="";
        Gender='\0';
        Age=0;
    }

    void display()
    {
        System.out.println("Name -->"+Name);
        System.out.println("Age -->"+Age);
        System.out.println("Gender -->"+Gender);
    }

    void input()
    {
        System.out.println("Enter Your Name -->");
        Name=in.nextLine();
        
        System.out.println("Enter Your Age -->");
        Age=in.nextInt();
        
        System.out.println("Enter Your Gender -->");
        Gender=in.next().charAt(0);
    }
}