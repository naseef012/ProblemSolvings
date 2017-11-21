package algorithms;

import java.math.BigInteger;

/**
 * Created By Naseef M Abdus Sattar on 11/22/2017 at 1:15 AM
 */
/*
    Make program which returns the Square root of a number. If it is not a perfect root, return -1.
 */
public class BigIntegerSQRRoot
{
    /**
     *  This Method returns the square root of the given BigInteger number by Binary Search. If the square root
     *  is not integer value then the method returns -1
     * @param N
     * @return Square root if value is integer else -1
     */

    public static BigInteger sqRoot(BigInteger N)
    {
        // returns the square root of N, if the root is an integer, or -1.

        if (N.equals(0) || N.equals(1))
            return N;


        BigInteger start = new BigInteger("0");
        BigInteger end = N.divide(BigInteger.valueOf(2));


        while (start.compareTo(end)!=1)
        {
            BigInteger mid = (start.add(end)).divide(BigInteger.valueOf(2));

            if (mid.multiply(mid).equals(N)) //mid*mid == N
            {
                return mid;
            }
            else if (mid.multiply(mid).compareTo(N)==-1) //mid*mid < N
            {
                start = mid.add(BigInteger.valueOf(1));
            }
            else
            {
                end = end.subtract(BigInteger.valueOf(1));
            }

        }
        return new BigInteger("-1");
    }

    public static void main(String[] args)
    {
        BigInteger n = new BigInteger("100");
        System.out.println(BigIntegerSQRRoot.sqRoot(n));
    }
}
