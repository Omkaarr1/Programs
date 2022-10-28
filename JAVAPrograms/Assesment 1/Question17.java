/*Write a Java program to extract the first half of a string of even length*/

import java.util.*;
public class Question17 {
public static void main(String[] args)
{
try (Scanner in = new Scanner(System.in)) {
    System.out.println("Enter the String");
    String main_string = in.nextLine();
    
    System.out.println(main_string.substring(0, main_string.length()/2));
}
}
}
