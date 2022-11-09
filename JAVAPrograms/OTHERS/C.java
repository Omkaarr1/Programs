import java.util.*;

public class C 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char ch;
        String result="";

        for(int i=0;i<line.length();i++)
        {
            ch = line.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {
                System.out.println("Invalid Input!");
                return;
            }
        }

        for (int i = 0; i < line.length(); i++) 
        {
            ch = line.charAt(i);

            if(Character.isUpperCase(ch))
            ch=Character.toLowerCase(ch);
            else
            ch=Character.toUpperCase(ch);

            result+=ch;
        }
        System.out.println(result);
    }    
}
