
//BASE PLUS COMMISSION EMPLOYEE

package Question_5.payroll;
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double salary) 
    {
        super(firstName, lastName, ssn, sales, rate);
        this.setBaseSalary(salary);
    }
    public double getBaseSalary() 
    {
        return baseSalary;
    }
    public void setBaseSalary(double salary) 
    {
        if(salary >= 0.0)
        {
            this.baseSalary = salary;
        }
        else
        throw new IllegalArgumentException("Base salary must be >0.0");
    }
    // calculate earnings; override method earnings in CommissionEmployee                                                           
    public double earnings()                                             
    {                                                                   
        return getBaseSalary() + super.earnings();                       
    }
    public String toString()                                           
    {                                                                  
        return String.format( "%s %s; %s: Rs%,.2f","base-salaried", super.toString(),"base salary",getBaseSalary() );                            
    }
}