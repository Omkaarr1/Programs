package Question_3;

//CALCULATOR DEMO CLASS

import Question_3.calculator.*;

public class calculatorDemo
{
    public static void main(String args[])
    {
        Add A = new Add();
        Substract B = new Substract();
        Multiplication M = new Multiplication();
        
        System.out.println("Addition of Two Numbers --> "+A.addTwoNumbers(1,2));
        A.addNNumbers();
        A.addTwoArray();
        
        System.out.println("Substaction of Two Numbers --> "+B.substractTwoNumbers(2,3));
        B.substractTwoArray();
        
        System.out.println("Multiplication of Two Numbers -->"+M.multiplyTwoNumbers(3,4));
        M.multiplyNNumbers();
        M.multiplyTwoArray();
    }
}
