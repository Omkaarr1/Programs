import java.util.*;

public class magicNumber 
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) {
            int n,temp,sum=0;

            System.out.println("Enter the Number");
            n=in.nextInt();

            while(n>=9)
            {
                temp = n;
                sum=0;
                while(temp>0)
                {
                    sum+=temp%10;
                    temp/=10;
                }
                n=sum;
            }

            if(n==1)
            System.out.println("Magic Number");
            else
            System.out.println("Not a Magic Number");
        }
    }    
}