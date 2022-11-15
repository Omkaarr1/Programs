package Question_1.university;
import java.util.*;
import school.*;

public class Academic
{
    String RegisterNumber, EmpID;
    Scanner in = new Scanner(System.in);

    public Academic() 
    {
        EmpID = RegisterNumber = "";
    }

    public void input(Student S,Teacher T) 
    {
        S.inputStudent();

        System.out.println("Enter Register Number -->");
        RegisterNumber = in.nextLine();

        T.inputTeacher();

        System.out.println("Enter Employee ID -->");
        EmpID = in.nextLine();
    }

    public void display() 
    {
        Student S = new Student();
        Teacher T = new Teacher();
        
        input(S,T);
        S.displayStudent();
        System.out.println("Register Number --> " + RegisterNumber);

        T.displayTeacher();
        System.out.println("Employee ID --> " + EmpID);
    }

    public static void main(String[] args) 
    {
        System.out.println("---------------------------- INSIDE ACADEMIC CLASS (INSIDE PACKAGE)----------------------------");

        Academic A = new Academic();

        A.input();
        A.display();
    }
}
