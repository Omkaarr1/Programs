import java.util.*;
public class Set_2_Question_3 
{
    static int stack[];
    static int top;

    Set_2_Question_3()
    {
        stack = new int[1000];
        top=-1;
    }

    static void push(int iteam)
    {
        ++top;
        stack[top]=iteam;
    }

    static void push_position(int position,int iteam)
    {
        if(position>top)
        {
            System.out.println("Addition Not Possible (Fill List to that position)");
            return;
        }

        for(int i=top+1;i>position;i--)
        {
            stack[i]=stack[i-1];
        }
        stack[position]=iteam;
        top++;
    }

    static void Display()
    {
        for(int i=0;i<=top;i++)
        {
            if(i!=top)
            System.out.print(stack[i]+" --> ");
            else
            System.out.print(stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        new Set_2_Question_3();

        int choice=0,iteam,position;
        do 
        {
            System.out.println("Enter 1 to Add Element to Linked List");    
            System.out.println("Enter 2 to Add Element at Specified Position");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            choice=in.nextInt();
            switch (choice) 
            {
                case 1:
                System.out.println("Enter Element To Push!");
                iteam=in.nextInt();
                push(iteam);
                break;

                case 2:
                
                System.out.println("Enter Element To Push!");
                iteam=in.nextInt();
                
                System.out.println("Enter Position!");
                position=in.nextInt();
                push_position(position, iteam);
                System.out.println("Pushed!\n");
                break;

                case 3:
                Display();
            }
            
        } while (choice!=4);

        in.close();
    }    
}
