package algorithms;

/**
 * Created by USER on 8/15/2017.
 */
public class FibonacciNumber
{
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        int n = 10;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}
