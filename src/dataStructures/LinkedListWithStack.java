package dataStructures;

import java.util.NoSuchElementException;

/**
 * Created by USER on 8/14/2017.
 */
public class LinkedListWithStack
{
    private Node top;
    private int size;

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(int data)
    {
        if (top==null)
        {
            top = new Node(data , null);
        }
        else
        {
            Node newNode = new Node(data ,null);
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public int pop()
    {
        if (isEmpty())
            throw new NoSuchElementException("UnderFlow Exception");
        Node node = top;
        top = node.getNext();
        size--;
        return node.getData();
    }

    public void display()
    {
        if (size == 0)
            System.out.println("Empty Stack");
        else
        {
            Node ptr = top;
            while (ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr = ptr.getNext();
            }
        }
    }

    public Node delete (int position)   //Position must be given assuming that count starts with 0
    {
        int count=0;
        if (position==0)
        {
            if (top == null)
                return null;
            else
            {
                Node temp = top;
                top = temp.getNext();
                size--;
                return temp;
            }
        }
        else
        {
            Node ptr = top;
            while (ptr.getNext()!=null)
            {
                if (count == position-1)
                {
                    Node deletedNode = ptr.getNext();
                    ptr.setNext(ptr.getNext().getNext());
                    size--;
                    return deletedNode;
                }
                count++;
                ptr = ptr.getNext();
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        LinkedListWithStack ls = new LinkedListWithStack();
        int i=0;
        while (i<=5)
        {
            ls.push(i);
            i++;
        }

        ls.display();
        System.out.println("Size before deletion: "+ls.getSize());

        ls.delete(5);
        ls.display();

        System.out.println("Size AFTER deletion: "+ls.getSize());

        ls.push(7);
        ls.display();
        System.out.println("Size after adding 7 is "+ls.getSize());
    }
}

class Node
{
    private int data;
    private Node next;

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }
}
