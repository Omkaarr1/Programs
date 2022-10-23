package Question_6;

// INCREASING NUMBER CLASS

import java.util.*;
class IncreasingNumber implements Increasing
{
    int N;
    
    IncreasingNumber()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter The Integer -->");
        N=in.nextInt();
    }
    
    public void isIncreasing()
    {
        int temp,flag=0;
        
        temp=N%10;
        N/=10;
        
        for(;N>0;N/=10)
        {
            if(temp>N%10)
            temp=N%10;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
        System.out.println("Increasing Number");
        else
        System.out.println("Not a Increasing Number");    
    }
    
    public static void main(String args[])
    {
        IncreasingNumber IN = new IncreasingNumber();
        
        IN.isIncreasing();
    }
}