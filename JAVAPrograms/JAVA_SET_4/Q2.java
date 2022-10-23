/*
 *   Implement a Java program with the following:
 *   a. A method to read two double type numbers from keyboard.
 *   b. A method to calculate the division of these two numbers.
 *   c. A try block to throw an exception when a wrong type of data is keyed in.
 *   d. A try block to detect and throw an exception if the condition “divide-by-zero”
 *   occurs.
 *   e. Appropriate catch block to handle the exceptions thrown.
 *  
 */

import java.util.*;
public class Q2 
{
    Scanner in = new Scanner(System.in);
    double a,b;

    public static void main(String[] args) throws Exception
    {
        Q2 q = new Q2();
        
        try 
        {
            q.readDouble();
            System.out.println("Result --> "+q.divide());
        }
        catch(InputMismatchException e) 
        {
            System.out.println("Enter Only Integer Values!!");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured --> "+e);
        }
    }

    void readDouble()
    {
        System.out.println("Enter Two Double Values -->");
        a=in.nextDouble();
        b=in.nextDouble();

        if(a == 0 || b == 0)
        {
            System.out.println("Division By Zero Not Allowed");
            System.exit(0);
        }
    }

    double divide()
    {
        return a/b;
    }
}
