package Question_6;


//INCREASING STRING CLASS

import java.util.*;
class IncreasingString implements Increasing
{
    String N;
    
    IncreasingString()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the String -->");
        N = in.nextLine();
    }
    
    public void isIncreasing()
    {
        int flag=0;
        
        N.toUpperCase();
        
        for(int i=0;i<N.length()-1;i++)
        if(N.charAt(i)>N.charAt(i+1))
        {
            flag=1;
            break;
        }
        
        if(flag == 0)
        System.out.println("Increasing String");
        else
        System.out.println("Not a Increasing String");
    }
    
    public static void main(String args[])
    {
        IncreasingString IS = new IncreasingString();
        
        IS.isIncreasing();
    }
}