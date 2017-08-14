import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by USER on 8/11/2017.
 */
public class DepthFirstSeaarch
{
    private int vertices;
    private LinkedList<Integer> [] graph;

    DepthFirstSeaarch (int vertices)
    {
        this.vertices = vertices;
        for (int i=0;i<vertices; i++)
        {
            graph[i] = new LinkedList<>();
        }
    }

    public void addEdge (int v , int w)
    {
        graph[v].add(w);
    }

    public void DFS (int start_point)
    {
        boolean visited [] = new boolean[vertices];
        DFSUtil(start_point , visited);
    }

    public void DFSUtil (int v , boolean visited[])
    {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = graph[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
            {
                visited[n] = true;
                DFSUtil(n , visited);
            }
        }

    }
}
