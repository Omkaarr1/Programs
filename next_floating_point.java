import java.util.*;
public class next_floating_point 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Enter the Decimal Number");
        a=in.nextInt();

        System.out.println(Integer.toHexString(a));

        in.close();
    }
}