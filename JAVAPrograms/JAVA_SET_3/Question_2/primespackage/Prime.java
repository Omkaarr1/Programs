package primespackage;
//Prime Class
public class Prime
{
    public boolean checkForPrime(int n)
    {
        int fact=0;
        
        for(int i=2;i<=n;i++)
        {
            if(n%i == 0)
            fact++;
        }
        
        if(fact == 1)
        return true;
        else
        return false;
    }
}