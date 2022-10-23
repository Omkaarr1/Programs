import java.util.*;
public class happyNumber 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n,temp,sum;

        System.out.println("Enter A Number");
        n=in.nextInt();

        while(n>=9)
        {
            temp = n;
            sum=0;
            while(temp>0)
            {
                sum+=(int)(Math.pow(temp%10,2));
                temp/=10;
            }
            n=sum;
        }

        if(n==1)
        System.out.println("Happy Number");
        else
        System.out.println("Not a Happy Number");

    }
}

/*
 *  We have to check n=19
    1^2+ 9^2 = 1 + 81 = 82
    8^2+ 2^2 = 64 + 4 = 68
    6^2+ 8^2 = 36 + 64 = 100
    1^2+ 0^2+0^2 = 1 + 0 + 0 = 1
 */