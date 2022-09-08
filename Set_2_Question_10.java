import java.util.*;
public class Set_2_Question_10 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String input,output="";

        System.out.println("Enter the Given Stirng -->");
        input=in.nextLine();

        System.out.println("Input --> "+input);

        for(int i=1;i<input.length();i+=2)
        output+=input.charAt(i);

        System.out.println("Output --> "+output);

        in.close();
    }
}
