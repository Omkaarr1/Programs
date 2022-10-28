/*
 * Write a Java program and compute the sum of the digits of an integer
 */
import java.util.*;
public class Question8 
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) {
            int n,sum=0;

            System.out.println("Enter the Number -->");
            n=in.nextInt();

            for(;n!=0;n/=10)
            sum+=(n%10);

            System.out.println("Sum --> "+sum);

            in.close();
        }
    }
}
