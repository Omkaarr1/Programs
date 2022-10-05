package Question_1.school;
/* TEACHER CLASS */

public class Teacher extends Person
{
    double Salary;

    public Teacher()
    {
        Salary=0.0;
    }

    public void displayTeacher()
    {
        System.out.println("---------------------------- DISPLAY INSIDE TEACHER CLASS ----------------------------");
        display();
        System.out.println("Salary -->"+Salary);
    }

    public void inputTeacher()
    {
        System.out.println("---------------------------- INSIDE TEACHER CLASS ----------------------------");
        
        input();

        System.out.println("Enter Salary -->");
        Salary=in.nextDouble();
    }
}