/*
 *   Write a class to sort the given set of integers in descending order. Include a try block
 *   to locate the array index out of bounds exception and catch it. Demonstrate this class
 *   with a main method.
 * 
 */

public class Q3 
{
    static int a = 0;
    public static void main(String[] args) 
    {
        /*   Let us Suppose that we want to Sort an Array of Length 5 */
        int A[]={10,2,8,6,64};
        
        try
        {
            for(int i=0;i<5;i++)
                    for(int j=0;j<6;j++) // This loop will Cause Error
                    {
                        if(A[i]>A[j])
                        {
                            int temp = A[i]; 
                            A[i] = A[j];    //This line will case Error as soon as it reachers A[5]
                            A[j] = temp;
                        }
                        print(A);
                    }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println();
            System.out.println("Error Occured: Index Exceeds!!");
            System.out.println();
        }
    }

    static void print(int A[])
    {
        a++;
        System.out.println("After "+a+" Iterations Array --> ");
        
        for (int i : A)
        System.out.print(i+"\t");
        
        System.out.println();
    }
}