/*
 * Write a Java program to print the sum (addition), multiply, subtract,divide and remainder of two numbers.
 */

import java.util.*;
public class Question1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float a,b;

        System.out.println("Enter First Number");
        a=in.nextFloat();

        System.out.println("Enter Second Number");
        b=in.nextFloat();
        
        System.out.println("Addidtion --> "+(a+b));
        System.out.println("Multiplication --> "+(a*b));
        System.out.println("Substraction --> "+(a-b));
        System.out.println("Division --> "+(a/b));

        in.close();
    }
}