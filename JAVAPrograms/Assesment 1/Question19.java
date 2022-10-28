/*Write a Java program to multiply corresponding elements of two arrays
of integers.*/

import java.util.*;
public class Question19 
{
public static void main(String[] args)
{
try (Scanner in = new Scanner(System.in)) {
    String result = "";
    int l;
    
    System.out.println("Enter the Length of Array");
    l=in.nextInt();
    
    int left_array[]=new int[l],right_array[]=new int[l];
    
    System.out.println("Enter Elements of First Array");
    for(int i=0;i<l;i++)
    left_array[i]=in.nextInt();
    
    System.out.println("Enter Elements of Second Array");
    for(int i=0;i<l;i++)
    right_array[i]=in.nextInt();
    
    
    System.out.println("\nArray1: "+Arrays.toString(left_array));
    System.out.println("\nArray2: "+Arrays.toString(right_array));
    for (int i = 0; i < left_array.length; i++) {
    int num1 = left_array[i];
    int num2 = right_array[i];
    result += Integer.toString(num1 * num2) + " ";
    }
    System.out.println("\nResult: "+result);
}
}
}
