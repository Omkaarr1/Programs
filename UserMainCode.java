import java.util.*;
import java.io.*;

class UserMainCode
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);

       int Length = in.nextInt();

       int count = in.nextInt();

       int[][] array = new int[count][2];

       Map<Integer, Integer> visibility = new HashMap<>();

       for(int i=0;i<count;i++) 
       {
           array[i][0] = in.nextInt();
           array[i][1] = in.nextInt();
           for(int j=array[i][0];j<array[i][0]+array[i][1];j++)
           visibility.put(j, i);   
       }

       Set<Integer> clothesRemaining = new HashSet<>();

       for(int key : visibility.keySet()) 
       clothesRemaining.add(visibility.get(key));

       System.out.println(clothesRemaining.size());

       in.close();
     }
}