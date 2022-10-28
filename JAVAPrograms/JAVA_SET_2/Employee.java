/*Create a class Employee (Identity number, name, department code, address,
designation, salary, DOJ, DOB) and perform the following operations for ‘N’
Employee (Use array of objects)
a. Reading the details.
b. Displaying the full details of a particular employee.
c. Employees of “XYZ” department.
d. The Senior most employee.
 */

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
}

class Employee 
{
    public static void main(String[] args) 
    {
        int n,i;
        try (Scanner in = new Scanner(System.in)) {
            String Name,Designation,DOJ;
            double Salary;
            int DepartmentCode,IDNumber;
            String display_using_name;
            int display_using_department_code,index_of_senior_most_employee=0,max;

            System.out.println("Enter the Number of Employee's -->");
            n=in.nextInt();
            
            Employe a[]=new Employe[n];

            System.out.println("Enter the Details -->");
            for(i=0;i<n;i++)
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
            
            in.nextLine();
            
            System.out.println("Enter Name of Employee to Display Full Details -->");
            display_using_name=in.nextLine();

            for(i=0;i<n;i++)
            if(a[i].Name.equals(display_using_name))
            break;

            if(i!=n)
            display(a,i);
            else
            System.out.println("Employee NOT Found");

            System.out.println("Enter Depeartment Code to Search Employee -->");
            display_using_department_code=in.nextInt();

            for(i=0;i<n;i++)
            if(a[i].DepartmentCode == display_using_department_code)
            break;

            if(i!=n)
            display(a,i);
            else
            System.out.println("Employee NOT Found");

            max=Integer.parseInt(a[0].DOJ.substring(6));

            for(i=0;i<n;i++)
            {
                if(max<Integer.parseInt(a[i].DOJ.substring(6)))
                {
                    max=Integer.parseInt(a[i].DOJ.substring(6));
                    index_of_senior_most_employee=i;
                }
            }

            System.out.println("Details of Senior Most Employee -->");
            display(a,index_of_senior_most_employee);

            in.close();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   

    static void display(Employe[] A,int index)
    {
        System.out.println("Name -->"+A[index].Name);
        System.out.println("Designation -->"+A[index].Designation);
        System.out.println("Date of Joining -->"+A[index].DOJ);
        System.out.println("Salary -->"+A[index].Salary);
        System.out.println("Department Code -->"+A[index].DepartmentCode);
        System.out.println("ID Number -->"+A[index].IDNumber);
    }
}