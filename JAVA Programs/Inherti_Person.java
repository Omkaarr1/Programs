import school.Student;
import school.Teacher;

/* MAIN CLASS */

public class Inherti_Person 
{
    public static void main(String[] args) 
    {
        Student A[]=new Student[3];
        Teacher B = new Teacher();

        for(int i=0;i<3;i++)
        A[i]=new Student();

        System.out.println("Enter Details of Student 1 -->");
        A[0].inputStudent();
        
        System.out.println("Enter Details of Student 2 -->");
        A[1].inputStudent();
        
        System.out.println("Enter Details of Student 3 -->");
        A[2].inputStudent();
        
        System.out.println("Enter Details of Teacher -->");
        B.inputTeacher();
        
        System.out.println();

        System.out.println("Datails of Student 1 -->");
        A[0].displayStudent();

        System.out.println("Datails of Student 2 -->");
        A[1].displayStudent();
        
        System.out.println("Datails of Student 3 -->");
        A[2].displayStudent();
        
        System.out.println("Datails of Teacher -->");
        B.displayTeacher();
    }
}
