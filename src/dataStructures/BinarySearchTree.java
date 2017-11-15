package dataStructures;

/**
 * Created by USER on 9/14/2017.
 */
public class BinarySearchTree
{
    //This Binary Search tree allows duplicate values to be stored
    /*

        If we plan to store "R A B S A B" we can follow any one of the below 3 methods


        To allow duplicate entries you have to modify the rule like bellow:

        Method 1:

        Go left if the element is less or equal root
        Go right if the element is greater than root.

                     R
                    / \
                   A   S
                  / \
                 A   B
                    /
                   B


        or

        Method 2:

        Go left if the element is less than root
        Go right if the element is greater or equal root.

                     R
                    / \
                   A   S
                    \
                     A
                      \
                       B
                        \
                         B

        or

        Method 3:

        Go left if the element is less than root
        Go right if the element is greater than root.
        Increase the count if the element is equal to the root.

                         R(1)
                       /  \
                      /    \
                     A(2)  S(1)
                      \
                       \
                       B(2)
     */

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

