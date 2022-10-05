import java.util.*;
public class basic_calculator 
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) 
        {
            int n;

            System.out.println("Enter a Number:");
            n=in.nextInt();  // 1462
            int s=0;         // s=0

            for(;n>0;n=n/10)
            s=(s*10)+(n%10); //s = 2641

            for(;s>0;s/=10)  //s=2641
            System.out.println(s%10); //1 4 6 2

            in.close();
        }
    }
}