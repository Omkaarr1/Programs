public class question_10_ 
{
    public static void main(String[] args) 
    {
        for(int i=100;i<433;i++)
        {
            if(((i%10) != ((i/10) % 10)) && (((i/10) % 10) != (i/100) && (i%10) != (i/100)))
            {
                if((i%10)>4  || ((i/10)%10>4 || (i/100)>4) || (i%10)==0  || ((i/10)%10==0 || (i/100)==0))
                continue;
                System.out.println(i);
            }
        }    
    }
}