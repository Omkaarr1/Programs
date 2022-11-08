import java.util.*;

public class practice 
{
    static void setArray(int[] A)
    {
        for(int i=A.length-1;i>0;i--)
        A[i] = A[i-1];
    }

    static void printArray(int A[])
    {
        for (int i : A) 
        {
            System.out.print(i+" ");    
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n,temp; 
        
        System.out.println("Enter the Length of the Array -->");
        n = in.nextInt();

        int A[] = new int[n];

        System.out.println("Enter Elements --> ");
        for(int i=0;i<n;i++)
        A[i] = in.nextInt();

        System.out.println();

        for(int i=n-1;i>-1;i--)
        {
            temp = A[n-1];
            setArray(A);
            A[0] = temp;
            printArray(A);
            temp=0;
        }
    }
}