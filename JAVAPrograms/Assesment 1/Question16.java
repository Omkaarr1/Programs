/* Write a Java program to convert a given string into lowercase */

import java.util.*;
public class Question16 
{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Input a String: ");
String line = in.nextLine();
line = line.toLowerCase();
System.out.println(line);
}
}
