/*

Write a program to create an exception PayOutofBounds (user created exception)
and fire the exception when basic pay entered is less than 10000. If a valid basic pay
is entered calculate the gross pay by the following formula:
gross pay = basic pay + DA + HRA + OT pay
where DA = 37% of the basic pay
HRA = 10% of the basic pay
OT = Over Time worked.
Display everything individually. 

*/

import java.util.*;
public class Q4 extends Exception
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        double BP,DA,HRA,OT,GP;

        try
        {
            System.out.println("Enter Basic Pay -->");
            BP=in.nextDouble();

            if(BP<10000)
            throw new PayOutofBounds("Base Pay Is Less Rs. 10,000");

            DA = BP + 0.37*BP;
            HRA = BP + 0.18*BP;
            OT = BP + 0.1*BP;
            GP=BP+DA+HRA+OT;

            System.out.println("Basic Pay --> "+BP);
            System.out.println("DA --> "+DA);
            System.out.println("HRA --> "+HRA);
            System.out.println("OT --> "+OT);
            System.out.println("Gross Pay --> "+GP);
        }
        catch(PayOutofBounds e)
        {
            System.out.println("Error Occured::");
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
