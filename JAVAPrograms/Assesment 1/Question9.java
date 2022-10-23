/*
 * Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
 */
import java.util.*;
public class Question9
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float n;

        System.out.println("Enter a Number!!");
        n=in.nextInt();

        float p = n + (n*n) + (n*n*n);

        System.out.println("Product --> "+p);
        in.close();
    }
}
