/*
 *  Implement a Java program to find the sum of command line arguments and count the
    invalid integers entered. (Throw exception if invalid integer is entered).
 * 
 */

import java.util.*;
public class Q1  
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String a="",b="";
        int flag=-2,A=0,B=0;

        try
        {
            flag++;
            a=in.nextLine();

            for(int i=0;i<a.length();i++)
            {
                char ch = a.charAt(i);
                if(!Character.isDigit(ch))
                throw new InputMismatchException();
            }
            
            flag++;
            b=in.nextLine();
            
            for(int i=0;i<b.length();i++)
            {
                char ch = b.charAt(i);
                if(!Character.isDigit(ch))
                throw new InputMismatchException();
            }

            A=Integer.parseInt(a);
            B=Integer.parseInt(b);
            
            System.out.println("Sum --> "+(A+B));
        }
        catch(InputMismatchException e)
        {
            System.out.println();
            System.out.println("Wrong Input!!!");

            if(flag == -1)
            System.out.println(a+" is Not a Correct Input as Integer");
            else
            System.out.println(b+" is Not a Correct Input as Integer");
            System.out.println();
        }
    }    
}