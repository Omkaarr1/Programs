import java.util.*;
class Solution {
   int value(char ch)
   {
       if(ch=='I')
           return 1;
       else if(ch=='V')
           return 5;
       else if(ch=='X')
           return 10;
       else if(ch=='L')
           return 50;
       else if(ch=='C')
           return 100;
       else if(ch=='D')
           return 500;
       else if(ch=='M')
           return 1000;
       else
           return -1;
   }
    void romanToInt(String s)
    {
        int l=s.length();
        int total=0,v1,v2,i;
        for(i=0;i<l;i++)
        {
            v1=value(s.charAt(i));
            if((i+1)<l)
            {
                v2= value(s.charAt(i+1));
                if(v1>=v2)
                {
                    total=total+v1;
                }
                     else
                {
                    total=total-v1;  
                }
            }
            else
            {
                total=total+v1;
            }
        }
        System.out.println(total);
    }
}
class ss
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution ob=new Solution();
        System.out.println("Enter the string");
        String s=sc.next();
        ob.romanToInt(s);
    }
}