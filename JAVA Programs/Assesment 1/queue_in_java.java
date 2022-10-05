import java.util.*;
public class queue_in_java 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Queue<Integer> Queue= new LinkedList<>();

       
        int c,item;

        do 
        {
            System.out.println("Enter 1 to Add!");
            System.out.println("Enter 2 to Remove!");
            System.out.println("Enter 3 to Display!");
            System.out.println("Enter 4 to Search in Queue!");
            System.out.println("Enter 5 to Get the TOP Element of the Queue!");
            System.out.println("Enter 6 to Exit!");
            c=in.nextInt();

            switch(c)
            {
                case 1:
                System.out.println("Enter Element -->");
                item=in.nextInt();
                Queue.add(item);
                break;

                case 2:  
                try
                {
                    System.out.println("Removed Element --> "+Queue.remove());
                }
                catch(Exception EmptyExpection)
                {
                    System.out.println("Queue Empty!!");
                    System.out.println();
                }
                break;

                case 3:
                for (Integer integer : Queue)
                {
                    if(integer!=null)
                    {
                        System.out.print(integer+" ");    
                    }
                    else
                    System.out.println("Queue Empty!");
                }
                System.out.println();
                break;

                case 4:
                System.out.println("Enter Element to Search!");
                item=in.nextInt();

                if(!Queue.contains(item))
                System.out.println("Element NOT Found!");
                else
                System.out.println("Element Found!");
                break;

                case 5:
                System.out.println("Top Element of the  is "+Queue.peek());
                break;
            }
        }while(c!=6);
        in.close();
    } 
}
