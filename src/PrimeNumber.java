import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 8/15/2017.
 */
public class PrimeNumber
{
    public boolean isPrime(int primeNumber)
    {
        if (primeNumber<=1)
        {
            return false;
        }
        else if(primeNumber == 2 || primeNumber==3)
        {
            return true;
        }
        else
        {
            int n = primeNumber/2;
            for (int i=2;i<=n ;i++ )
            {
                if (primeNumber%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int primeNumber;
        PrimeNumber p = new PrimeNumber();
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<=100;i++)
        {
            if (p.isPrime(i))
            {
                li.add(i);
            }
        }
        for (int j : li)
        {
            System.out.println (j);
        }
    }
}
