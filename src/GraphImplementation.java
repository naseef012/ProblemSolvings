import java.util.LinkedList;

/**
 * Created by USER on 8/8/2017.
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






}
