import java.util.*;
class LeetCode1 {
    public int[] twoSum(int[] nums, int target) 
    {
        int a[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    a[0]=nums[i];
                    a[1]=nums[j];
                    return a;
                }
            }
        }
        return a;
    }
    
    public static void main(String[] args)
    {
        LeetCode1 x = new LeetCode1();
        Scanner in = new Scanner(System.in);
        String input;
        int l=0,target;
        char ch;

        input=in.nextLine();
        ch=input.charAt(0);

        for(int i=0;ch!=']';i++)
        {
            if(Character.isDigit(input.charAt(i)))
            l++;
            ch=input.charAt(i);
        }
               
        int a[]=new int[l];
        ch=input.charAt(0);

        for(int i=0,j=0;ch!=']';i++)
        {
            if(Character.isDigit(input.charAt(i)))
            a[j]=input.charAt(i)-'0';
            ch=input.charAt(i);
        }
        
        target = in.nextInt();
               
        a=x.twoSum(a,target); 
               
        System.out.println("["+a[0]+","+a[1]+"]");
    }
}