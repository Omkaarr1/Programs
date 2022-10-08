public class printPatter 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println();
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                if(i%2==0 && j>1 && j<5)
                {
                    System.out.print("\t");
                    continue;
                }
                if(i==3 && j%2==0)
                {
                    System.out.print("\t");
                    continue;
                }
                
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            
        }    
    }
}
