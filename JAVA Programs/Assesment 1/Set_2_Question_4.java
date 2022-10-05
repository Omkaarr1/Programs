import java.util.*;
public class Set_2_Question_4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);    
        String input;
        
        System.out.println("Enter the String!");
        input=in.nextLine();

        char ch[]=new char[input.length()];
        ch=input.toCharArray();

        for(int i=0;i<input.length();i++)
        {
            char c=ch[i];
            for(int j=i+1;j<input.length();j++)
            if(c==ch[j])
            ch[j]='\0';
        }

        input="";
        for (char c : ch) 
        input+=c;    

        System.out.println("Formatted String --> "+input);

        in.close();
    }    
}
