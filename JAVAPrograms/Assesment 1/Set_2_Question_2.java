import java.util.*;
public class Set_2_Question_2 
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) {
            int a,b;

            System.out.println("Enter the First Number");
            a=in.nextInt();

            System.out.println("Enter the Second Number");
            b=in.nextInt();

            for(;a>=b;a-=b);

            System.out.println("Remainder: "+a);

            in.close();
        }
    }    
}
