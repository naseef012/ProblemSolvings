/**
 * Created by USER on 9/14/2017.
 */
public class BinarySearchTree
{
    BinarySearchTree left,right;
    int data;

    BinarySearchTree (int data)
    {
        this.data = data;
    }

    public void insert (int value)
    {
        if (value<=data)
        {
            if (left==null)
            {
                left = new BinarySearchTree(value);
            }
            else
            {
                left.insert(value);
            }
        }
        else
        {
            if (right == null)
            {
                right = new BinarySearchTree(value);
            }
            else
            {
                right.insert(value);
            }
        }
    }

    public boolean contains (int value)
    {
        if (value==data)
            return true;
        else if (value<data)
        {
            if (left==null)
                return false;
            else
               return left.contains(value);
        }
        else
        {
            if (right==null)
                return false;
            else
                return right.contains(value);
        }
    }

    public void printInOrder()
    {
        if (left!=null)
            left.printInOrder();
        System.out.println(data);
        if (right!=null)
            right.printInOrder();

    }



}

