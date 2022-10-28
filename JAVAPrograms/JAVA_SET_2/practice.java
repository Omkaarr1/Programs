import java.util.*;

class Employee 
{
    String IdentityNo;
    String name;
    int deptcode;
    String designation;
    int salary;
    String DOJ;
    Scanner sc = new Scanner(System.in);

    void read() 
    {
        IdentityNo = sc.next();
        name = sc.next();
        deptcode = sc.nextInt();
        designation = sc.next();
        salary = sc.nextInt();
        DOJ = sc.next();
    }

    void display() 
    {
        System.out.println(IdentityNo + "\n" + name + "\n" + deptcode + "\n" + designation + "\n" + salary + "\n" + DOJ);
    }
}

public class practice
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            int n = sc.nextInt();
            Employee[] e = new Employee[n];
            for (i = 0; i < n; i++) {
                e[i].read();
                e[i].display();
            }
        }
    }
}