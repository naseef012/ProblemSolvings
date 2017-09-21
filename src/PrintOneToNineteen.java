/**
 * Created by USER on 9/21/2017.
 *
 * Problem: Print
 *
 *          "1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1"
 *
 *          in one loop.
 */
public class PrintOneToNineteen
{
    public static void main(String[] args)
    {
        for (int i=1;i<20;i++)
        {
            if (i<=10)
                System.out.println(i);
            else
                System.out.println(20-i);
        }
    }
}
