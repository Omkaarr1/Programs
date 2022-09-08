/*
 * Write a Java program to convert seconds to hour, minute and seconds
 */

import java.util.*;
public class Question11 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input seconds: ");

		int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        
        p2 = p2 / 60;
        
        System.out.println( p2 + ":" + p3 + ":" + p1);
		
        in.close();
    }
}
