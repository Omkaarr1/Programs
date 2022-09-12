import java.util.Arrays;

class ThreeSum {
    public static void main(String[] args)
    {
        int[] nums={-1,0,1,2,-1,-4};
        int n=nums.length,count=0;
        
        for(int i=0;i<n;i++)
            for(int  j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)
                    if((nums[i] + nums[j] + nums[k] == 0))
                    count++;
        
        int result[][]=new int[count][3];
        for(int i=0;i<n;i++)
            for(int  j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)
                    if((nums[i] + nums[j] + nums[k] == 0))
                    {
                        result[i][0]=nums[i];
                        result[i][1]=nums[j];
                        result[i][2]=nums[k];
                        Arrays.sort(result[i]);
                    }
        
        for(int i=0;i<result.length;i++)
        System.out.println(result[i][0]+","+result[i][1]+","+result[i][2]);
    }
}