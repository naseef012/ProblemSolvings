package algorithms;

/**
 * Created By Naseef M Abdus Sattar on 10/2/2017 at 9:23 PM
 */
public class MergeSortAlgo
{
    private int [] mainArray;

    public void Merge (int[] left, int[] right, int[] mainArray)
    {
        int lengthOfLeftArray = left.length;
        int lengthOfRightArray = right.length;

        // iterator counts for Left array, Right array and Main array respectively
        int i=0,j=0,k=0;

        /*
            This loop checks which subarray's element is smaller
            which is then overwritten in the main array.
         */
        while (i < lengthOfLeftArray && j < lengthOfRightArray)
        {
            if (left[i] < right[j])
            {
                mainArray[k]=left[i];
                i++;
            }
            else
            {
                mainArray[k]=right[j];
                j++;
            }
            k++;
        }

        /*
            This loop will execute if the two subarrays are not equal in length and any one
            is exhausted before the other.
         */
        while (i<lengthOfLeftArray || j<lengthOfRightArray)
        {
            if (i<lengthOfLeftArray)
            {
                mainArray[k]=left[i];
                i++;
            }
            else if (j<lengthOfRightArray)
            {
                mainArray[k] = right[j];
                j++;
            }
            k++;
        }

    }

    public void MergeSort(int[] array)
    {
        int lengthOfArray = array.length;
        if (lengthOfArray < 2)
            return;
        int midPoint = lengthOfArray/2;
        int [] left = new int[midPoint];
        int [] right = new int[lengthOfArray - midPoint];

        for (int i=0; i<midPoint-1;i++)
        {
            left[i] = array[i];
        }
        for (int i=midPoint;i<lengthOfArray-1;i++)
        {
            right[i-midPoint] = array[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(left,right,array);

    }
}
