//TwinPrime Class
import primespackage.*;
import java.util.*;

class TwinPrime
{
    public static void main(String args[])
    {
        Prime P = new Prime();
        Scanner in = new Scanner(System.in);
        
        int a,b;
        
        System.out.println("Enter The Range (a,b) -->");
        a=in.nextInt();
        b=in.nextInt();
        
        for(int i=a;i<b;i++)
        {
            if(P.checkForPrime(i))
            for(int j=a+1;j<b;j++)
            {
                if(P.checkForPrime(j))
                {
                    if((i-j) == 2)
                    System.out.println("("+j+","+i+")");
                }
            }
        }
    }
}