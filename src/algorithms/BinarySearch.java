package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Naseef M Abdus Sattar on 11/16/2017 at 1:21 AM
 */
public class BinarySearch
{
    public static boolean binarySearchRecursive(int [] array , int valueToBeFound , int left , int right)
    {
        if (left>right)
            return false;

        int mid = (left+right)/2;

        if (array[mid]==valueToBeFound)
        {
            return true;
        }
        else if (valueToBeFound < array[mid])
        {
            return binarySearchRecursive(array,valueToBeFound,left,mid-1);
        }
        else
        {
            return binarySearchRecursive(array,valueToBeFound,mid+1,right);
        }
    }

    public static boolean binarySearchRecursive (int [] array, int valueToBeFound)
    {
        return binarySearchRecursive(array,valueToBeFound,0,array.length-1);
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
        if (BinarySearch.binarySearchRecursive(array,valueToBeFound))
            System.out.println("The Number is in the array ");
        else
            System.out.println("The Number can not be found");
    }
}
