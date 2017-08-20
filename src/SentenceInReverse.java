import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by USER on 8/20/2017.
 *
 * Print a sentence in Reverse.
 */
public class SentenceInReverse
{
    public void reverseSentence (String sentence)
    {
        //String st = sentence.trim();
        //System.out.println(st);
        String [] array = sentence.split("\\s");
        for (int j=array.length-1; j>=0 ;j--)
        {
            System.out.println(array[j]);
        }

    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String d ;
        System.out.println("Enter Sentence ");
        d = s.nextLine();
        SentenceInReverse sr = new SentenceInReverse();
        sr.reverseSentence(d);
    }
}
