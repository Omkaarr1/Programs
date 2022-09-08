import java.util.*;
public class Set_2_Question_6 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int l;

        System.out.println("Enter the Length of the Array -->");
        l=in.nextInt();

        char ch[]=new char[l],c1,c2;

        System.out.println("Enter the Elements of the Array --> ");
        for(int i=0;i<l;i++)
        ch[i]=in.next().charAt(0);

        System.out.println("Missing Elements --> ");
        for(int i=0,j=1;j<l;i++,j++)
        {
            for(c1=ch[i],c2=ch[j];c1<c2;)
            {
                if(++c1 == c2)
                continue;
                System.out.print(c1+" ");
            }
        }

        in.close();
    }    
}
