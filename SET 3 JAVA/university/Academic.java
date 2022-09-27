package university;

import school.*;
import java.util.*;

public class Academic {
    String RegisterNumber, EmpID;
    Scanner in = new Scanner(System.in);

    Academic() {
        EmpID = RegisterNumber = "";
    }

    public void input() {

        Student S = new Student();
        Teacher T = new Teacher();

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

        S.displayStudent();
        System.out.println("Register Number --> " + RegisterNumber);

        T.displayTeacher();
        System.out.println("Employee ID --> " + EmpID);
    }

    public static void main(String[] args) {
        Academic A = new Academic();

        A.input();
        A.display();
    }
}
