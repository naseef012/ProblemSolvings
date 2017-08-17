import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by USER on 8/16/2017.
 */
public class DuplicateNumbers
{
    public void findDuplicate (int [] arr)
    {
        Arrays.sort(arr);
        /*for (int k =0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }*/
        int j =0;
        int temp [] = new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(j);

                if (temp[j]==arr[i])
                {
                    System.out.println("hi");
                    break;
                }

            else if (arr[i] == arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int k =0;k<j;k++)
        {
            System.out.println("lol " + temp[k]);
        }
    }

    public static void main(String[] args)
    {
        DuplicateNumbers dpl = new DuplicateNumbers();
        int arr[] = {1,2,1,3,3,3,3,4,5,5,5};
        dpl.findDuplicate(arr);
    }
}
