import java.util.*;
public class Set_2_Question_1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int r,c;

        System.out.println("Enter the Row of the 2D Matrix!!");
        r=in.nextInt();

        System.out.println("Enter the Coloum of the 2D Matrix!!");
        c=in.nextInt();
        
        int a[][]=new int[r][c];
        int A[][]=new int[c][r];

        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        a[i][j]=in.nextInt();

        System.out.println("Input Array -->\n");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }

        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        A[j][i]=a[i][j];

        System.out.println("Transposed Array -->\n");

        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            System.out.print(A[i][j]+"\t");
            System.out.println();
        }

        in.close();
        
    }
}
