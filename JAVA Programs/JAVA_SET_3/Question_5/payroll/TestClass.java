
//TEST CLASS
package Question_5.payroll;
public class TestClass 
{
    public static SalariedEmployee salariedEmployee;
    public static HourlyEmployee hourlyEmployee;
    public static CommissionEmployee commissionEmployee;
    public static BasePlusCommissionEmployee basePlusCommissionEmployee;
    public static void main(String[] args) 
    {
        Employee[] employees = new Employee[4];
        employees[0] =  new SalariedEmployee("Archangel", "Macsika", "A001", 680000.00);
        employees[1] = new HourlyEmployee("Nsikak", "Imoh", "A002", 17.00, 9000);
        employees[2] =  new CommissionEmployee("John", "Doe", "A003", 9100000, 0.04);
        employees[3] = new BasePlusCommissionEmployee("Rose", "Maryland", "A004", 2120000, .03, 590000);

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) 
        {
            System.out.println(currentEmployee); // invokes toString

            if (currentEmployee instanceof BasePlusCommissionEmployee) 
            {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf( "new base salary with 10%% increase is: Rs%,.2f\n",  employee.getBaseSalary());
            }
            System.out.printf( "earned Rs%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
