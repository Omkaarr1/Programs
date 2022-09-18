/*Create a class Employee(Identity number, name, department code, designation,
salary, DOJ) and perform the following operations for ‘N’ Employee (Use array of
objects)
a. Reading the details.
b. Display details of employee under a particular cadre */

import java.util.*;
class Employe 
{
    String Name,Designation,DOJ;
    double Salary;
    int DepartmentCode,IDNumber;
    
    Employe()
    {
        Name=Designation=DOJ="";
        Salary=0.0;
        DepartmentCode=IDNumber=0;
    }

    Employe(String Name,String Designation,String DOJ,double Salary,int DepartmentCode,int IDNumber)
    {
        this.Name=Name;
        this.Designation=Designation;
        this.DOJ=DOJ;
        this.Salary=Salary;
        this.DepartmentCode=DepartmentCode;
        this.IDNumber=IDNumber;
    }

    void display()
    {
        System.out.println("Name -->"+Name);
        System.out.println("Designation -->"+Designation);
        System.out.println("Date of Joining -->"+DOJ);
        System.out.println("Salary -->"+Salary);
        System.out.println("Department Code -->"+DepartmentCode);
        System.out.println("ID Number -->"+IDNumber);
    }

    void maxOfEmployee(Employe a[])
    {
        double max;
        int index=0;

        max = a[0].Salary;

        for(int i=0;i<a.length;i++)
        {
            if(a[i].Salary>max)
            {
                max=a[i].Salary;
                index = i;
            }
        }

        a[index].display();
    }
}

class Employee 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner in = new Scanner(System.in);
        String Name,Designation,DOJ;
        double Salary;
        int DepartmentCode,IDNumber;

        System.out.println("Enter the Number of Employee's -->");
        n=in.nextInt();
        
        Employe a[]=new Employe[n];

        System.out.println("Enter the Details -->");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Name -->");
            in.nextLine();
            Name = in.nextLine();

            System.out.println("Enter ID Number -->");
            IDNumber = in.nextInt();

            in.nextLine();
            System.out.println("Enter Designation -->");
            Designation = in.nextLine();

            System.out.println("Enter Deparment Code -->");
            DepartmentCode = in.nextInt();
            
            System.out.println("Enter Date of Joining -->");
            in.nextLine();
            DOJ = in.nextLine();

            System.out.println("Enter Salary -->");
            Salary = in.nextDouble();

            a[i]=new Employe(Name, Designation, DOJ, Salary, DepartmentCode, IDNumber);
        }

        System.out.println("Employee with Highest Salary -->");
        a[0].maxOfEmployee(a);

        in.close();
    }   
}