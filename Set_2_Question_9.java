import java.util.*;
public class Set_2_Question_9 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String string;

        System.out.println("Enter the String -->");
        string = in .nextLine();

        char ch[]=new char[string.length()];

        ch=string.toCharArray();

        System.out.println("Given String as Character Array -->");

        for (char c : ch) 
        System.out.print(c+" ");

        in.close();
    }    
}