import java.util.*;

/*
 * NumberFormatException
 * EOFException
 * IOException
 * InputMismatchExcpetion
 * NullPointerException
 * ArithmeticException
 * ArrayOutOfBoundsException
 * StringOutOfBoundsException
 * NonSerializiableException
 * FileNotFoundException
 * ClassNotFoundException
 * NoSuchFieldException
 * NoSuchMethodException
 * RuntimeException
 * IllegalArgumentException
 */

public class Exceptionn
{
    public static void main(String[] args) throws InbuiltException 
    {
        Scanner in = new Scanner(System.in);

        try 
        {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a%2 == 0 || b%2 == 0)
            throw new InbuiltException("Don't Give Even Values");
            int c = a/b;

            System.out.println(c);
        } 
        catch(InputMismatchException e1)
        {
            System.out.println("Error: Don't Give Alphabets");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Error: Don't Give 0 as Divisor");
        }
        catch(InbuiltException e3)
        {
            System.out.println(e3.getMessage());
        }

        System.out.println("End of Program");
    }
}