import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Naseef M Abdus Sattar on 10/11/2017 at 11:48 PM
 *
 * Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array.
 * It is given that all array elements are distinct.
 *
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
        k = 3
 * Output: 7
 */

public class KthSmallestOrLargestElement
{

    public void findTheElement(int [] arr , int index)
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The "+index+"th smallest number is "+arr[index-1]);
        System.out.println("The "+index+"th largest number is "+arr[arr.length - index]);
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<arr.length;i++)
        {
            int j = s.nextInt();
            arr[i] = j;
        }

        System.out.println("Enter the index which you want to find: ");
        int kthPosition =s.nextInt();
        KthSmallestOrLargestElement func = new KthSmallestOrLargestElement();
        func.findTheElement(arr,kthPosition);
    }
}
/*

 */