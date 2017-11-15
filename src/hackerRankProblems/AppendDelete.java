package hackerRankProblems;

import java.util.Scanner;

/**
 * Created By Naseef M Abdus Sattar on 11/13/2017 at 11:17 PM
 */
public class AppendDelete
{
    public static boolean getResult (String s, String t, int k)
    {
        int sLength = s.length();
        int tLength = t.length();

        //System.out.println(sLength);
        //System.out.println(tLength);
        int commonPartLength = 0;

        for (int i =0;i<Math.min(sLength,tLength);i++)
        {
            if (s.charAt(i)== t.charAt(i))
            {
                commonPartLength++;
               /* System.out.println("s char at iteration "+i+" "+s.charAt(i));
                System.out.println("t char at iteration "+i+" "+t.charAt(i));
                System.out.println("common part loop "+commonPartLength);*/
            }
            else
                break;
        }
        /*while (s.charAt(i)!= t.charAt(i))
        {
            commonPartLength++;
            i++;
        }*/

        System.out.println("common part " +commonPartLength);

        int sDifference = sLength - commonPartLength;
        int tDifference = tLength - commonPartLength;

        int difference = tDifference+sDifference;
        int operationNumberNeeded;

        if (difference == 0)
        {
            operationNumberNeeded = sLength+tLength+1;
        }
        else
        {
            operationNumberNeeded = difference;
        }

       //System.out.println("difference in s " + sDifference);
        //System.out.println("difference in t " +tDifference);

        System.out.println(operationNumberNeeded);
        if (operationNumberNeeded == k)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(AppendDelete.getResult(s,t,k));

    }
}
/*
abac
abadef
4

aba
aba
7

hackerrank
hackerhappy
9

aaa
a
5
runtime error       yes

asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv
asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv
20
yes

aaaaaaaaaa
aaaaa       runtime error  --output yes
7

qwerty
zxcvbn
100             yes
 */