package hackerRankProblems;

/**
 * Created By Naseef M Abdus Sattar on 11/13/2017 at 12:04 AM
 */

/*
    Input:   str = "a,b$c"
    Output:  str = "c,b$a"
    Note that $ and , are not moved anywhere.
    Only subsequence "abc" is reversed

    Input:   str = "Ab,c,de!$"
    Output:  str = "ed,c,bA!$"
 */

public class ArrayInverseSpecial
{
    public static void main(String[] args)
    {
        //Scanner s = new Scanner (System.in);
        //System.out.println()
        String str = "a,b$c";
        //System.out.println(hackerRankProblems.ArrayInverseSpecial.getReversedString(str));
        System.out.println(ArrayInverseSpecial.getReverse(str));
       // hackerRankProblems.ArrayInverseSpecial.getReverse(str);
    }

    public static boolean isAlphabet(char c)
    {
        return ((c >= 'A' && c <= 'Z') || (c >='a' && c<= 'z'));
    }

    public static String getReverse(String str)
    {
        int l = 0;
        int r = str.length() - 1;

        char charArray[] = str.toCharArray();

        //System.out.println(Arrays.toString(charArray));

        while (l < r)
        {
            if (!Character.isLetter(charArray[l]))
                l++;
            else if (!Character.isLetter(charArray[r]))
                r--;
            else
            {
                char temp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = temp;

                l++;
                r--;
            }
        }

        return charArray.toString();
    }
}
