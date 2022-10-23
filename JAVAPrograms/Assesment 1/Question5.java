/*
 * Write a Java program to convert a decimal number to hexadecimal number
 */
import java.util.*;
public class Question5 
{
    public static void main(String[] args) 
    {
    Scanner in = new Scanner(System.in);

     System.out.print("Enter a decimal number : ");
     int num = in.nextInt();
        
     // For storing remainder
     int rem;
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("Decimal to hexadecimal: "+str2);

     in.close();
    }
}
