import java.io.*;
import java.util.InputMismatchException;
public class B 
{
    public static void main(String[] args) throws IOException 
    {
        
        try
        {
            BufferedReader reader1 = new BufferedReader(new FileReader("name.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("phonenumber.txt"));
        
            String x,y;
            char ch;
            
            System.out.println(reader1.readLine());

            for(x=reader1.readLine();x.equals("0");x = reader1.readLine())
            {
                for(int i=0;i<x.length();i++)
                {
                    ch=x.charAt(i);
                    if(!Character.isLetterOrDigit(ch))
                    throw new InputMismatchException();
                }
            }

            
            for(y=reader2.readLine();y.equals("0");y = reader2.readLine())
            {
                if(y.length()!=10)
                throw new NumberFormatException();
            }

            reader1.close();
            reader2.close();
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Special Character Not Allowed");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Phone Number is Invalid");
        }
    }
}
