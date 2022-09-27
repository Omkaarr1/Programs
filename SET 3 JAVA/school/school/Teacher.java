package school;
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
        display();
        System.out.println("Salary -->"+Salary);
    }

    public void inputTeacher()
    {
        input();

        System.out.println("Enter Salary -->");
        Salary=in.nextDouble();
    }
}