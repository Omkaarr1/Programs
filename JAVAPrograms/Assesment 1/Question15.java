/*
 * . Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
 */
import java.util.*;
public class Question15
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n,a[];

        System.out.println("Enter the Length of Array");
        n=in.nextInt();

        if(!(n>2))
        {
            System.out.println("Enter the length atleast greater than 2!!");
            in.close();
            return;
        }
        a=new int[n];

        System.out.println("Enter Element's of the Array --> ");

        for(int i=0;i<n;i++)
        a[i]=in.nextInt();

        if(a[0]==a[n-1])
        System.out.println("First and Last Elements are the Same");
        else
        System.out.println("First and Last Elements are NOT the Same");

        in.close();
    }    
}
