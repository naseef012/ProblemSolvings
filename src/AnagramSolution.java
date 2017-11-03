import java.util.Scanner;

/**
 * Created by USER on 8/26/2017.
 *
 * Given two Strings, how many characters do you need to remove (from either) to make them anagrams?
 * Example: hello , billion  ---> Answer : 6 [ 'h','e' from hello and 'b','i','n' from billion]
 */
public class AnagramSolution
{
    /**
     * This method takes the character count arrays of both the strings and finds the difference between them.
     * @param charCount1 -> is the number of occurrences of the words in the string 1
     * @param charCount2 -> is the number of occurrences of the words in the string 2
     *
     * @return the difference between them.
     */
    public static int getDelta(int []charCount1,int[]charCount2)
    {
        if (charCount1.length!=charCount2.length)
            return -1;
        int delta=0;
        for (int i = 0; i<charCount1.length;i++)
        {
            int difference = Math.abs(charCount1[i] - charCount2[i]);
            delta+=difference;
            //System.out.println("Difference in iteration "+i+" is "+delta);
        }
        return delta;
    }

    /**
     * This Method returns an integer array which contains the occurrence number of all the characters in the str
     * @param str
     * @return an array which contains the number of occurrences of every word of the string
     */
    public static int[] getCharCount(String str)
    {
        int [] charCount =new int[26];
        for (int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            int offset = (int)'a';
            //System.out.println("Offset = "+offset);
            int code = c-offset;
            //System.out.println("Code = "+code);
            charCount[code]++;
        }
        return charCount;
    }

    /**
     * This Method takes in both the strings and finds out the number of changes needed for them to be complete anagrams
     * @param s1
     * @param s2
     * @return Number of changes needed to make them anagrams.
     */
    public static int numberNeeded(String s1, String s2)
    {
        int [] charCount1 = getCharCount(s1);
        int [] charCount2 = getCharCount(s2);
        return getDelta(charCount1,charCount2);
    }

    /**
     *  The main method
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);

        System.out.println("Enter String 1");
        String s1 = sd.nextLine();

        System.out.println("Enter String 2");
        String s2 = sd.nextLine();

        int s = numberNeeded(s1,s2);
        System.out.println("Difference = "+s);
    }
}