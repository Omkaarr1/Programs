/*Create a class ComplexArithmetic perform Complex number arithmetic operations.
The Complex object should be created in main function that is enclosed within a class
ComplexMain. The complex arithmetic operations should be executed in an menu
driven way( Use switch case ) */

import java.util.*;
class ComplexArithmetic
{
    Scanner in = new Scanner(System.in);
    int a1,a2,b1,b2;

    void input()
    {
        int a1,a2,b1,b2;

        System.out.println("Enter Real Part of 1st Number -->");
        a1=in.nextInt();

        System.out.println("Enter Imaginary Part of 1st Number -->");
        a2=in.nextInt();

        System.out.println("Enter Real Part of 2st Number -->");
        b1=in.nextInt();

        System.out.println("Enter Imaginary Part of 2st Number -->");
        b2=in.nextInt();

        this.a1=a1;
        this.a2=a2;
        this.b1=b1;
        this.b2=b2;
    }

    void add()
    {
        if(b1+b2 > 0)
        System.out.println("Addition --> "+(a1+a2)+" + i"+(b1+b2));
        else
        System.out.println("Addition --> "+(a1+a2)+" - i"+(b1+b2)*-1);
    }

    void sub()
    {
        System.out.println("Substraction --> "+(a1>a2?a1-a2:a2-a1)+" + i"+(b1>b2?b1-b2:b2-b1));
    }

    void mul()
    {
        if(a1>0 && a2>0)
        {
            if(b1 > 0 && b2 > 0)
            System.out.println("Multiplication --> "+(a1*a2)+" + i"+(b1*b2));
            else if(b1<0 && b2<0)
            System.out.println("Multiplication --> "+(a1*a2)+" - i"+(b1*b2));
            else
            System.out.println("Multiplication --> "+(a1*a2)+" - i"+(b1*b2*-1));
        }
        else
        {
            if(b1 > 0 && b2 > 0)
            System.out.println("Multiplication --> "+(a1*a2)+" + i"+(b1*b2));
            else if(b1<0 && b2<0)
            System.out.println("Multiplication --> "+(a1*a2)+" - i"+(b1*b2));
            else
            System.out.println("Multiplication --> "+(a1*a2)+" - i"+(b1*b2*-1));
        }
    }
}

public class ComplexArethemiticDemo 
{
    public static void main(String[] args) 
    {
        ComplexArithmetic i = new ComplexArithmetic();
        
        i.input();
        i.add();
        i.sub();
        i.mul();
    }    
}
