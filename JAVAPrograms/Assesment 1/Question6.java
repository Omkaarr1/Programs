/*Write a Java program to convert a octal number to decimal number*/

import java.util.*;
public class Question6 
{
public static void main(String[] args) 
{
try (Scanner in = new Scanner(System.in)) {
    System.out.println("Enter the Number");
    int decimal = in.nextInt();;
    
    int octal = convertDecimalToOctal(decimal);
    System.out.printf("%d in decimal = %d in octal", decimal, octal);
}
}

public static int convertDecimalToOctal(int decimal)
{
int octalNumber = 0, i = 1;
while (decimal != 0)
{
octalNumber += (decimal % 8) * i;
decimal /= 8;
i *= 10;
}
return octalNumber;
}
}
