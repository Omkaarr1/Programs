package Question_1.school;
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
        System.out.println("---------------------------- DISPLAY INSIDE STUDENT CLASS ----------------------------");
        display();
        System.out.println("Grade -->"+Grade);
    }

    public void inputStudent()
    {
        System.out.println("---------------------------- INSIDE STUDENT CLASS ----------------------------");
        input();
        System.out.println("Enter Grade -->");
        Grade=in.next().charAt(0);
    }
}