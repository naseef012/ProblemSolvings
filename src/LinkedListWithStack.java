import java.util.NoSuchElementException;

/**
 * Created by USER on 8/14/2017.
 */
public class LinkedListWithStack
{
    private Node top;
    private int size;

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
