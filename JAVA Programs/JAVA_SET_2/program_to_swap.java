/**
 * program_to_swap
 */
import java.util.*;
public class program_to_swap 
{
    int a,b;
    static program_to_swap x = new program_to_swap();
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Value -->");
        x.a=in.nextInt();

        System.out.println("Enter Second Value -->");
        x.b=in.nextInt();

        System.out.println("Before Reversing -->");
        System.out.println("Value of A -->"+x.a);
        System.out.println("Value of B -->"+x.b);        

        x.swap();
        
        System.out.println("After Reversing -->");
        System.out.println("Value of A -->"+x.a);
        System.out.println("Value of B -->"+x.b);
        
        in.close();
    }
    
    void swap()
    {
        int temp=x.a;
        x.a=x.b;
        x.b=temp;
    }
}