import java.util.*;
public class Set_2_Question_7 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);   
        int l,result=0;


        System.out.println("Enter the Length of the Array!!");
        l=in.nextInt();

        int integer[]=new int[l];

        System.out.println("Enter the Values --> ");

        for(int i=0;i<l;i++)
        integer[i]=in.nextInt();

        for(int i=0;i<l;i++)
        for(int j=0;j<l;j++)
        if(integer[i]>integer[j])
        {
            int temp=integer[i];
            integer[i]=integer[j];
            integer[j]=temp;
        }

        for (int i : integer)
        result=(result*10)+i;    
       
        System.out.println("Largest number using the said array number is --> "+result);
        
        in.close();

    }    
}
