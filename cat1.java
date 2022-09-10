import java.util.*;
public class cat1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int dec=0;
        String hex;
        StringBuffer temphex;
        char ch;

        System.out.println("Enter the HexaDecimal Number -->");
        hex = in.next().toUpperCase();
        temphex=new StringBuffer(hex);

        temphex=temphex.reverse();
        hex = new String(temphex);

        for(int i=0;i<hex.length();i++)
        {
            ch=hex.charAt(i);

            if(Character.isDigit(ch))
            dec += (int) Math.pow(16,i) * Integer.parseInt(ch+"");
            else if(Character.isLetter(ch))
            {
                if(ch == 'A')
                dec += (int) Math.pow(16,i) * 10;
                else
                if(ch == 'B')
                dec += (int) Math.pow(16,i) * 11;
                else 
                if(ch == 'C')
                dec += (int) Math.pow(16,i) * 12;
                else 
                if(ch == 'D')
                dec += (int) Math.pow(16,i) * 13;
                else 
                if(ch == 'E')
                dec += (int) Math.pow(16,i) * 14;
                else
                if(ch == 'F')
                dec += (int) Math.pow(16,i) * 15;
            }
            else
            {
                System.out.println("Not a Valid HexaDecimal Number!");
                return;
            }
        }

        System.out.println("The Decimal Value for the Gvien HexaDecimal Number is --> "+(int)dec);
    }
}