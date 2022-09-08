// Java code for stack implementation
import java.util.*;
class stack_in_java
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();


        int c,item;

        do 
        {
            System.out.println("Enter 1 to Push!");
            System.out.println("Enter 2 to Pop!");
            System.out.println("Enter 3 to Display!");
            System.out.println("Enter 4 to Search in Array!");
            System.out.println("Enter 5 to Get the TOP Element of the Stack!");
            System.out.println("Enter 6 to Exit!");
            c=in.nextInt();

            switch(c)
            {
                case 1:
                System.out.println("Enter Element -->");
                item=in.nextInt();
                stack.push(item);
                break;

                case 2:  
                try
                {
                    System.out.println("Poped Element --> "+stack.pop());
                }
                catch(Exception EmptyStackExpection)
                {
                    System.out.println("Stack Empty!!");
                    System.out.println();
                }
                break;

                case 3:
                for (Integer integer : stack)
                {
                    if(stack.peek() != integer)
                    System.out.print(integer+" -->");
                    else
                    System.out.print(integer);
                }System.out.println();
                break;

                case 4:
                System.out.println("Enter Element to Search!");
                item=in.nextInt();

                if(stack.search(item) == -1)
                System.out.println("Element NOT Found!");
                else
                System.out.println("Element Found!");
                break;

                case 5:
                System.out.println("Top Element of the Stack is "+stack.peek());
                break;
            }
        }while(c!=6);
        in.close();
    }
}