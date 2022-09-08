/*Write a Java program to create the concatenation of the two strings
except removing the first character of each string. The length of the
strings must be 1 and above.(If Str1 = Java and Str2 = Tutorial, then the
result = avautorial*/

import java.util.*;
public class Question18 {
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the First String");
String str1 = in.nextLine();

System.out.println("Enter the Second String");
String str2 = in.nextLine();

System.out.println(str1.substring(1) + str2.substring(1));
}
}
