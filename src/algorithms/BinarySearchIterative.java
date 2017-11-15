package algorithms;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Naseef M Abdus Sattar on 11/16/2017 at 2:35 AM
 */
public class BinarySearchIterative
{
    public static boolean binarySearch(int [] array, int valueToBeFound)
    {
        int left = 0;
        int right = array.length-1;

        while (left<=right)
        {
            int mid = left+((right-left)/2);
           // System.out.println("Mid "+mid);

            if (array[mid]==valueToBeFound)
                return true;
            else if (valueToBeFound < array[mid] )
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int array[] = {1,2,3,67,23,12,34,65,21,45,22,63,89};

        //System.out.println(array.length);
        System.out.println("Enter array element you want to find");
        int valueToBeFound = s.nextInt();

        Arrays.sort(array);

        //System.out.println(valueToBeFound);

       // System.out.println(Arrays.toString(array));
        if (BinarySearchIterative.binarySearch(array,valueToBeFound))
            System.out.println("The Number is in the array ");
        else
            System.out.println("The Number can not be found");
    }
}
