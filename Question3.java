/*
 * Write a Java program to print the area and perimeter of a rectangle
 */
import java.util.*;
public class Question3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int l,b;

        System.out.println("Enter the Length of the Rectangle");
        l=in.nextInt();

        System.out.println("Enter the Breath of the Rectangle");
        b=in.nextInt();

        System.out.println("Area --> "+(l*b));
        System.out.println("Perimeter --> "+(2*(l+b)));

        in.close();
    }
}
