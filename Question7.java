/*Write a Java program to convert a hexadecimal number to binary
number*/

import java.util.Scanner;
class Question_7
{
Scanner scan;
int num;
void getVal()
{
System.out.println("HexaDecimal to Binary");
scan = new Scanner(System.in);
System.out.println("\nEnter the number :");
num = Integer.parseInt(scan.nextLine(), 16);}
void convert()
{
String binary = Integer.toBinaryString(num);
System.out.println("Binary Value is : " + binary);
}
}
class Question7
{
public static void main(String args[])
{
Question_7 obj = new Question_7();
obj.getVal();
obj.convert();
}
}
