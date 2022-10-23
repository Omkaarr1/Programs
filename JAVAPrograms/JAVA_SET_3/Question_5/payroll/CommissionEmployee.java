
//COMISSION EMPLOYEE CLASS
package Question_5.payroll;
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double  commissionRate;
    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) 
    {
        super(firstName, lastName, ssn);
        this.setCommissionRate(rate);
        this.setGrossSales(sales);
    }
    public double getGrossSales() 
    {
        return grossSales;
    }
    public void setGrossSales(double sales) 
    {
        if(sales >= 0.0)
        {
            this.grossSales = sales;
        }
        else
        throw new IllegalArgumentException("gross sales must be > 0.0");
    }
    public double getCommissionRate()
    {
        return commissionRate;
    }
    public void setCommissionRate(double rate) 
    {
        if(rate > 0.0 && rate < 1.0)
        {
            this.commissionRate = rate;
        }
        else
        throw  new IllegalArgumentException("Commission rate must be > 0 and < 1.0");
    }
    public double earnings() 
    {
        return getGrossSales()*getCommissionRate();
    }
    public String toString()
    {
        return String.format("%s: %s\n%s: Rs%,.2f; %s: %.2f","commission employee",super.toString(),"gross sales",getGrossSales(),"commission rate",getCommissionRate());
    }
}

