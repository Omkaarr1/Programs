
/* STUDENT CLASS */

public class Student extends Person
{
    char Grade;

    Student()
    {
        Grade='\0';
    }

    Student(char Grade)
    {
        this.Grade=Grade;
    }

    void displayStudent()
    {
        display();
        System.out.println("Grade -->"+Grade);
    }

    void inputStudent()
    {
        input();
        System.out.println("Enter Grade -->");
        Grade=in.next().charAt(0);
    }
}
