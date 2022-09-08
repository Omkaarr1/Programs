import java.util.*;
public class febonacie_recurssion 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n,p=0,a=0,b=1,c=0;

        System.out.println("Enter value of N -->");
        n=in.nextInt();
        System.out.print(a+" "+b+" ");

        recursion(n,p,a,b,c);

        in.close();
    }
    static void recursion(int n,int p,int a,int b,int c)
    {
        if(p<n)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            p++;
            recursion(n, p, a, b, c);//omkar + shashwath - yukti
        }
    }
}
