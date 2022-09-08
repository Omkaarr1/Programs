import java.util.*;
/**
 * call_by_value_call_by_reference
 */
public class call_by_value_call_by_reference 
{
    static int a,b; //global variable

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);
        call_by_value_call_by_reference x = new call_by_value_call_by_reference(); //object of class

        System.out.println("Enter First Value!");
        a=in.nextInt();

        System.out.println("Enter Second Value!");
        b=in.nextInt();

        value(a,b);     // Actual Parameter
        System.out.println("After call Value of A and B (Call by Value) --> "+a+" "+b);
        refrence(x);    // Actual Parameter
        System.out.println("After call Value of A and B (Call by Refrence) --> "+a+" "+b);

        in.close();
    }
    
    static void value(int a,int b) // Formal Parameter
    {
        int temp = a;
        a=b;
        b=temp;

        System.out.println("Value of A and B (Call by Value)--> "+a+" "+b);
    }

    static void refrence(call_by_value_call_by_reference x) //Formal Parameter
    { 
        int temp=x.a;
        x.a=x.b;
        x.b=temp;
        System.out.println("Value of A and B (Call by Refrence)--> "+a+" "+b);
    }
}