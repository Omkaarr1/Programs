/*
 * Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return
 * 0 and return the smaller value if the two values have the same remainder when divided by 6
 * 
 */
import java.util.*;
public class Question14
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int a,b;
        System.out.println("Enter First Number!!");
        a=in.nextInt();

        System.out.println("Enter Second Number!!");
        b=in.nextInt();

        if(a>b)
        {
            System.out.println(a);
            in.close();
            return;
        }
        else if(a==b)
        System.out.println(0);
        else if((a%6)==(b%6))
        if(a>b)
        System.out.println(b);
        else
        System.out.println(a);
        else
        System.out.println(b);

        in.close();
    }
}

