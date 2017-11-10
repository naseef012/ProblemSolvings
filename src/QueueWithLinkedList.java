/**
 * Created By Naseef M Abdus Sattar on 11/3/2017 at 9:13 PM
 */
public class QueueWithLinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty()
    {
        if (head==null)
            return true;

        return false;
    }

    public int getSize()
    {
        return size;
    }

    public void add(int data)
    {
        Node newNode = new Node (data,null);
        if (tail!=null)
        {
            tail.setNext(newNode);
            size++;
        }
        tail = newNode;

        if (head==null)
        {
            head = newNode;
            size++;
        }
    }

    public int peek ()
    {
        return head.getData();
    }

    public int remove()
    {
        int data = head.getData();

        head = head.getNext();
        if (head==null)
        {
            tail = null;
        }

        return data;
    }

    /**
     *
     * @param position
     * @return
     */

    public Node removeByPosition(int position)
    {
        if (head==null)
        {
            return null;
        }

        if (position==0)
        {
            Node deletedNode = head;
            head = head.getNext();
            return deletedNode;
        }
        else
        {
            int count = 0;
            Node ptr = head;
            while (ptr.getNext()!=null)
            {
                if (count == position-1)
                {
                    if (ptr.getNext()== tail)
                    {
                        Node deletedNode = tail;
                        ptr.setNext(null);
                        tail = ptr;
                        size--;
                        return deletedNode;
                    }
                    else
                    {
                        Node deletedNode = ptr.getNext();
                        ptr.setNext(ptr.getNext().getNext());
                        size--;
                        return deletedNode;
                    }
                }
                count++;
                ptr = ptr.getNext();
            }
        }
        return null;
    }

    /**
     * This method prints the data of the queue
     */

    public void print()
    {
        if (size == 0)
            System.out.println("Empty Queue");
        else
        {
            Node ptr = head;
            while (ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr = ptr.getNext();
            }
        }
    }

    public static void main(String[] args)
    {
        QueueWithLinkedList ls = new QueueWithLinkedList();
        int i=0;

        //Data is inserted into the queue. 0-5.
        while (i<=5)
        {
            ls.add(i);
            i++;
        }

        ls.print();
        System.out.println("Size before deletion: "+ls.getSize());

        System.out.println("Deleted Node's Data of Position 2 : "+ls.removeByPosition(2).getData());

        ls.print();

        System.out.println("Deleted Node's Data of Position 4 : "+ls.removeByPosition(4).getData());

        ls.print();


        System.out.println("Size AFTER deletion: "+ls.getSize());
    }

}