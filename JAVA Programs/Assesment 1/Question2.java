/*
 * Write a Java program that takes a number as input and prints its multiplication table upto 10
 */
import java.util.*;
public class Question2 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter the Number!");
        n=in.nextInt();

        for(int i=1;i<11;i++)
        System.out.println(n+" * "+i+" = "+(n*i));

        in.close();
    }
}
