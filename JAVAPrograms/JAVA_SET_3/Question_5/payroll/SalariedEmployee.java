
// SALARED EMPLOYEE CLASS 

package Question_5.payroll;
public class SalariedEmployee extends Employee
{
    private double weeklySalary; 
    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) 
    {
        super(firstName, lastName, ssn);    
        this.setWeeklySalary(salary);
    }   
    public double getWeeklySalary() 
    {
        return weeklySalary;
    }
    public void setWeeklySalary(double salary) 
    {
        if(salary >= 0.0)
        {
            this.weeklySalary = salary;
        }
        else 
        throw new IllegalArgumentException("Weekly Salary Must be >= 0.0");
    }
    public double earnings() 
    {
        return  getWeeklySalary();
    }
    public String toString()
    {
        return String.format("salaried employee: %s\n%s: Rs%,.2f", super.toString(), "weekly salary" , getWeeklySalary());
    }
}