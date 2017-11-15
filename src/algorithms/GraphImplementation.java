package algorithms;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by USER on 8/8/2017.
 * This is Breadth First Search Implementation
 */
public class GraphImplementation
{
    private LinkedList<Integer> graph[];
    private int vertices;

    GraphImplementation(int v)
    {
        vertices = v;
        graph = new LinkedList[vertices];
        for (int i =0; i <vertices ; i++)
        {
            graph[i] = new LinkedList();
        }
    }

    public void addEdge(int vertice , int width)
    {
        graph[vertice].add(width);
    }


    public void BFS (int s)
    {
        boolean visited [] = new boolean[vertices];

        visited[s] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        //ListIterator i = graph[s].listIterator();

        while (queue.size()!=0)
        {
            s = queue.poll();
            System.out.print (s+ " ");

            Iterator<Integer> i = graph[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }

    }

    public static void main(String[] args)
    {
        GraphImplementation g = new GraphImplementation(8);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(0, 5);
        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(2, 5);
        g.addEdge(3, 1);
        g.addEdge(3, 6);
        g.addEdge(4, 0);
        g.addEdge(4, 5);
        g.addEdge(6, 3);
        g.addEdge(6, 5);


        g.BFS(0);
    }



}
