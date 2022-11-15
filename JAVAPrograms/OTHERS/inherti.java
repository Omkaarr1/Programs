import java.util.ArrayList;

/**
 * L_Q3
 */
public class inherti
{
    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList<Integer>();
        Integer i = 1;

        list.add(i);
        list.add(i);
        list.add(i);
        list.add(i);
        list.add(i);
        list.add(i);

        for (Object object : list) 
        {
            System.out.println(object);    
        }

    }    
}