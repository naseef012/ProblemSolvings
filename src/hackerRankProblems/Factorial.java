package hackerRankProblems;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created By Naseef M Abdus Sattar on 11/13/2017 at 10:37 PM
 */
/*
    You are given an Integer N. Print the factorial
                N! = N * (N-1) * (N-2).....3 * 2 * 1
     Input:
     Input consists of a single integer N, where 1 < N < 100.

     Output
     Print the factorial of N.

    Example
    For an input of 25, you would print 15 511 210 043 330 985 984 000 000.

    Note: Factorials of N > 20 can't be stored even in a 64-bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

    We recommend solving this challenge using BigIntegers.

 */
public class Factorial
{
    public static BigInteger getFactorial (int num)
    {
       /* if (num == 0)
            return 1;
        else
            return (num * getFactorial(num - 1));
       */

       BigInteger f = new BigInteger("1");
       for (int i = 2 ; i <= num ; i++)
       {
           f = f.multiply(BigInteger.valueOf(i));
       }
       return f;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number to get the factorial of: ");
        int num = s.nextInt();
        System.out.println("hackerRankProblems.Factorial of "+ num +" is " + Factorial.getFactorial(num));
    }
}
