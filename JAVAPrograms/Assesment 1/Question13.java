/*Write a Java program to find the number of values in a given range 
divisible by a given value.
(For example x = 5, y=20 and p =3, find the number of integers within the 
range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 })
*/

import java.util.*;
public class Question13 
{
public static void main(String[] args)
{
    try (Scanner in = new Scanner(System.in)) {
        int x,y,p;
        
        System.out.println("Enter Start Value -->");
        x=in.nextInt();
        
        System.out.println("Enter Enter Value -->");
        y=in.nextInt();
        
        System.out.println("Enter The Dividend -->");
        p=in.nextInt();
        
        for(int i=x;i<=y;i++)
        if(i%p==0)
        System.out.print(i+" ");
    }
}
}
