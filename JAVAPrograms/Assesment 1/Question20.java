/*Write a Java program to check if a string starts with the word “Java”.*/

import java.util.*;
public class Question20 {
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter The String!!");
String string1 = in.nextLine();

System.out.println(string1.startsWith("Java"));
}
}
