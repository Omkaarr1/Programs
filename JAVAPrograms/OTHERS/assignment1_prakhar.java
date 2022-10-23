import java.util.*;
public class assignment1_prakhar 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        String name[]=new String[6];
        String gender[]=new String[6];
        int age[]=new int[6];
        int weight[]=new int[6];
        int height[]=new int[6];
        int temp,meanh=0,meanw=0,malecount=0,femalecount=0;

        for(int i=0;i<6;i++)
        {
            name[i]=in.next();
            age[i]=in.nextInt();
            gender[i]=in.next();
            height[i]=in.nextInt();
            weight[i]=in.nextInt();
        }

        System.out.print("[");
        for(int i=0;i<6;i++)
        {
        if(i!=5)
        System.out.print(name[i]+", ");
       else
       System.out.print(gender[i]);   }
        System.out.print("]\n");

        System.out.print("[");
        for(int i=0;i<6;i++)
        {
        if(i!=5)
        System.out.print(age[i]+", ");  
        else
        System.out.print(gender[i]);  }
        System.out.print("]\n");

        System.out.print("[");
        for(int i=0;i<6;i++)
        {
        if(i!=5)
        System.out.print(gender[i]+", ");
        else
        System.out.print(gender[i]);
        }
        System.out.print("]\n");

        System.out.print("[");
        for(int i=0;i<6;i++)
        {
        if(i!=5)
        System.out.print(height[i]+", ");
        else
        System.out.print(gender[i]);
        }
        System.out.print("]\n");
        System.out.print("[");

        for(int i=0;i<6;i++)
        {
        if(i!=5)
        System.out.print(weight[i]+", ");
        else
        System.out.print(gender[i]);
        }
        System.out.print("]\n");

        for(int i=0;i<6;i++)
        for(int j=0;j<6;j++)
        if(height[i]<height[j])
        {
            temp = height[i];
            height[i]=height[j];
            height[j]=temp;
        }

        System.out.println("Minimum Height : "+height[0]);
        System.out.println("Maximum Height : "+height[5]);
        
        for(int i=0;i<6;i++)
        for(int j=0;j<6;j++)
        if(weight[i]<weight[j])
        {
            temp = weight[i];
            weight[i]=weight[j];
            weight[j]=temp;
        }

        System.out.println("Minimum weight : "+weight[0]);
        System.out.println("Maximum weight : "+weight[5]);

        for(int i=0;i<6;i++)
        meanh+=height[i];

        
        for(int i=0;i<6;i++)
        meanw+=weight[i];

        meanh/=6;
        meanw/=6;

        System.out.println("Mean Value of ht: "+meanh);
        System.out.println("Mean Value of wt: "+meanw);
        
        for(int i=0;i<6;i++)
        {
            if(gender[i]=="m")
            malecount++;
            else if(gender[i]=="f")
            femalecount++;
        }

        System.out.println("Male count : "+malecount);
        System.out.println("Female count : "+femalecount);

        in.close();
    }
}
