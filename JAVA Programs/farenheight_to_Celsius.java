import java.util.*;
class farenheight_to_Celsius
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        float n;
        System.out.println("Enter the value of N --> ");
        n=in.nextFloat();
        
        System.out.println("Value in Celcius --> "+n);
        n=(5*(n-32))/9;
        System.out.println("Value in Farenheight --> "+n);

        in.close();
    }
}