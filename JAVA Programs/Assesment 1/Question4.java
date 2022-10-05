/*
 * Write a Java program to swap two variables.(with and without using third variables)
 */
import java.util.*;
public class Question4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter Two Numbers");

        a=in.nextInt();
        b=in.nextInt();

        System.out.println("Originally A = "+a+" and B = "+b);

        c=a;
        a=b;
        b=c;

        System.out.println("After Switching A = "+a+" and B = "+b);

        in.close();
    }
}
