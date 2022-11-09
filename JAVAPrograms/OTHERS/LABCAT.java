import java.util.*;
class LABCAT
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        String line;
        char ch;

        line = in.nextLine();

        for(int i=0;i<line.length();i++)
        {
            ch = line.charAt(i);
            if(!Character.isDigit(ch) && i==line.length()-1)
            {
                // Throw Exception
                System.out.println("Exception");
            }
        }
    }
}