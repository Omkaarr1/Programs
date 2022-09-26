
/* TEACHER CLASS */

public class Teacher extends Person
{
    double Salary;

    Teacher()
    {
        Salary=0.0;
    }

    Teacher(double Salary)
    {
        this.Salary=Salary;
    }

    void displayTeacher()
    {
        display();
        System.out.println("Salary -->"+Salary);
    }

    void inputTeacher()
    {
        input();

        System.out.println("Enter Salary -->");
        Salary=in.nextDouble();
    }
}