import java.util.*;

import javax.lang.model.util.ElementScanner14;

class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int T = in.nextInt();
	    
	    int A[][]=new int[1][3];
        int B[][]=new int[1][3];
        int C[][]=new int[1][3];

        for(int i=0;i<T;i++)
        {
            A[0][i]=in.nextInt();
            B[0][i]=in.nextInt();
            C[0][i]=in.nextInt();
        }

        for(int i=0;i<T;i++)
        {
            if(A[0][i] < B[0][i] && A[0][i] < C[0][i])
            System.out.println("Draw");
            else if(B[0][i] < A[0][i] && B[0][i] < C[0][i])
            System.out.println("Bob");
            else
            System.out.println("Alice");
        }
	}
}
