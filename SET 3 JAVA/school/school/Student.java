package school;
/* STUDENT CLASS */

public class Student extends Person
{
    char Grade;

    public Student()
    {
        Grade='\0';
    }

    public void displayStudent()
    {
        display();
        System.out.println("Grade -->"+Grade);
    }

    public void inputStudent()
    {
        input();
        System.out.println("Enter Grade -->");
        Grade=in.next().charAt(0);
    }
}