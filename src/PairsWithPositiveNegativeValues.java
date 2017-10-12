import java.util.*;

/**
 * Created By Naseef M Abdus Sattar on 10/12/2017 at 2:16 PM
 */
 /* Given an array of distinct integers, print all the pairs having positive value and negative value of a number that exists in the array.

    NOTE: If there is no such pair in the array , print "0".

     Input:
     The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an integer n.The next line of each test case consists of n spaced integers.

     Output:
     Print all the required pairs in the increasing order of their absolute numbers.

     Constraints:
     1<=T<=100
     1<=n<=1000
     -1000<=a[i]<=1000

     Example:
     Input:
     2
     6
     1 -3 2 3 6 -1
     8
     4 8 9 -4 1 -1 -8 -9

     Output:
     -1 1 -3 3
     -1 1 -4 4 -8 8 -9 9
 */
public class PairsWithPositiveNegativeValues
{
    public static int[] pairFind (int [] array)
    {
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        /*
            Storing the absolute values of the array elements
         */
        for (int i=0;i<array.length;i++)
        {
           li.add(Math.abs(array[i]));
        }

        /*
            Sorting the List containing the absolute array elements
         */
        Collections.sort(li);

       // Counter for iterating the sorted list
        int j=0;

        /*
         Storing the absolute values in the HashMap as [Key , Value] pairs.
         Value represents the number of occurrences of the Key.
         */
        while (j<li.size())
        {
            Integer count = map.get(li.get(j));
            if (count == null)
            {
                map.put(li.get(j) , 1);
            }
            else
            {
                map.put(li.get(j),++count);
            }
            j++;
        }

        /*
         Traversing through the Map to find the Keys which has Value = 2
         If the Value is equal to 2 it means the Key has negative value pair.
         */
        for (Map.Entry m: map.entrySet())
        {
            Integer c = (Integer)m.getValue();
            if (c==2)
            {
                finalList.add((Integer) m.getKey());
            }
        }

        /*
        Declaring an array which is twice the size of the "finalList" since this array will contain both
        the postive and negative numbers.
         */
       int finalArray[] =new int[finalList.size() * 2];

       int k=0; //Counter for array iterator

        /*
        Here we are storing the negative of an finalList element in the array followed by the
        postive value.
         */
       for (int i = 0; i<finalList.size();i++)
       {
           finalArray[k] = - finalList.get(i);
           k++;
           finalArray[k] = finalList.get(i);
           k++;
       }

        return finalArray;
    }
    public static void main(String[] args)
    {
        int arr[] = {5,6,-6,7,8,-5,-7};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(PairsWithPositiveNegativeValues.pairFind(arr)));


    }
}
