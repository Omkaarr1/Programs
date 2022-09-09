import java.util.*;
public class cat1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n,k,temp,i,j;

        System.out.println("Enter Length of Array -->");
        n=in.nextInt();

        int a[]=new int[n];

        System.out.println("Enter Shift -->");
        k=in.nextInt();

        System.out.println("Enter Elements of the Array -->");

        for(int i=0;i<n;i++)
        a[i] = in.nextInt();

        // 1 2 3 4 5 6 7 8 9
        // 7 8 9 4 5 6 1 2 3
        // 7 8 9 1 2 3 4 5 6

        for(i=n-1,j=0;j<k;j++,i--)
        {
            temp = a[j];
            a[j] = a[i];
            a[i]=a[j];
        }

        i=j;
        j+=k;

        for(;i<n;i++)
        {
            temp=a[i];
        }



        

    }
}
