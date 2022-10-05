import java.util.*;
public class Set_2_Question_5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int l1,l2;

        System.out.println("Enter Length of Integer Array!!");
        l1=in.nextInt();

        System.out.println("Enter Length of String Array!!");
        l2=in.nextInt()+1;

        int integer[]=new int[l1];
        String string[]=new String[l2];

        System.out.println("Enter the Elements of Integer Array -->");

        for(int i=0;i<l1;i++)
        integer[i]=in.nextInt();

        System.out.println("Enter the Elements of String Array -->");

        for(int i=0;i<l2;i++)
        string[i]=in.nextLine();

        for(int i=0;i<l1;i++)
        for(int j=0;j<l1;j++)
        if(integer[i]<integer[j])
        {
            int temp=integer[i];
            integer[i]=integer[j];
            integer[j]=temp;
        }

        System.out.println("Sorted Integer Array -->");

        for(int i=0;i<l1;i++)
        System.out.print(integer[i]+" ");
        System.out.println();

        for(int i=0;i<l2;i++)
        for(int j=0;j<l2;j++)
        if(string[j].compareTo(string[i])>0)
        {
            String temp=string[i];
            string[i]=string[j];
            string[j]=temp;
        }

        System.out.println("Sorted String Array -->");

        for(int i=0;i<l2;i++)
        System.out.print(string[i]+" ");
        System.out.println();

        in.close();
    }
}
