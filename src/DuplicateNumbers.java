import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by USER on 8/16/2017.
 *
 * Problem: Find the duplicate numbers in a given array
 */

/**
 * This is implemented using HashMap.
 * Time Complexity is O(2n)
 * Space Complexity is O(n)
 */
public class DuplicateNumbers
{
    public void findDuplicate (int [] arr)
    {
        /*HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (int s: arr)
        {
            if(!set.add(s))
            {
                System.out.println(s);
            }
        }*/
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int s: arr)
        {
            Integer count = map.get(s);
            if(count == null)
            {
                map.put(s,1);
            }
            else
            {
                map.put(s,++count);
            }
        }

       for (Map.Entry m : map.entrySet())
       {
           Integer c = (int)m.getValue();
           if (c > 1)
           {
               System.out.println("duplicate "+ m.getKey());
           }

       }
    }
    public static void main(String[] args)
    {
        DuplicateNumbers dpl = new DuplicateNumbers();
        int arr[] = {1,3,7,7,19,3,3,2,1,3,4,5,5,5};
        dpl.findDuplicate(arr);
    }
}
